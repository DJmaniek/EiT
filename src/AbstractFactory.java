public class AbstractFactory {

    public static void main(String[] args) {
        Computer computer;
        computer = new Computer("AMD001", new AMDFactory());
        computer = new Computer("INTEL001", new IntelFactory());
    }
}
    //RODZINA PRODUKTÓW: PROCESORY
    interface Processor {
        void process();
    }

    class AMDProcessor implements Processor {
        @Override
        public void process() {
            System.out.println("Przygotowuję procesor AMD...");
        }
    }

    class IntelProcessor implements Processor {
        @Override
        public void process() {
            System.out.println("Przygotowuję procesor Intel...");
        }
    }

    //RODZINA PRODUKTÓW: WIATRACZKI
    interface Cooler {
        void process();
    }

    class AMDCooler implements Cooler {
        @Override
        public void process() {
            System.out.println("Przygotowuję wiatraczek AMD...");
        }
    }

    class IntelCooler implements Cooler {
        @Override
        public void process() {
            System.out.println("Przygotowuję wiatraczek Intel...");
        }
    }

    //RODZINA FABRYK: PRODUCENCI
    interface ProcessorFactory {
        Processor createProcessor();
        Cooler createCooler();
    }

    class AMDFactory implements ProcessorFactory {

        @Override
        public Processor createProcessor() {
            return new AMDProcessor();
        }

        @Override
        public Cooler createCooler() {
            return new AMDCooler();
        }
    }

    class IntelFactory implements ProcessorFactory {

        @Override
        public Processor createProcessor() {
            return new IntelProcessor();
        }

        @Override
        public Cooler createCooler() {
            return new IntelCooler();
        }
    }

    class Computer {
        private final String serialNumber;
        private final Processor processor;
        private final Cooler cooler;

        public Computer(String serialNumber, ProcessorFactory factory) {
            this.serialNumber = serialNumber;
            processor = factory.createProcessor();
            cooler = factory.createCooler();
            process();
        }

        private void process() {
            System.out.println("Komputer o numerze seryjnym " + serialNumber + " jest aktualnie składany");
            processor.process();
            cooler.process();
            System.out.println("Zakończyłem składanie komputera o numerze seryjnym: " + serialNumber);
        }
    }