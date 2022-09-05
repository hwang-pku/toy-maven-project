package anonymous;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
public class ConGenerator extends Generator<Con> {

    public ConGenerator() {
        super(Con.class);
    }

    @Override
    public Con generate(SourceOfRandomness random, GenerationStatus generationStatus) {
        Con ret = new Con(random.nextInt());
        return ret;
    }
}
