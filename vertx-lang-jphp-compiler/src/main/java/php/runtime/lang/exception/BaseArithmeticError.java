package php.runtime.lang.exception;

import php.runtime.annotation.Reflection.Name;
import php.runtime.env.Environment;
import php.runtime.exceptions.support.ErrorType;
import php.runtime.reflection.ClassEntity;

@Name("ArithmeticError")
public class BaseArithmeticError extends BaseError {
    public BaseArithmeticError(Environment env, ErrorType errorType) {
        super(env, errorType);
    }

    public BaseArithmeticError(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
