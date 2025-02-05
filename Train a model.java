import weka.classifiers.functions.LinearRegression;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class StockPrediction {
    public static void main(String[] args) throws Exception {
        DataSource source = new DataSource("/path/to/dataset.arff");
        Instances dataset = source.getDataSet();
        dataset.setClassIndex(dataset.numAttributes() - 1);

        LinearRegression lr = new LinearRegression();
        lr.buildClassifier(dataset);

        for (int i = 0; i < dataset.numInstances(); i++) {
            Instance instance = dataset.instance(i);
            double prediction = lr.classifyInstance(instance);
            System.out.println("Prediction for instance " + i + ": " + prediction);
        }
    }
}