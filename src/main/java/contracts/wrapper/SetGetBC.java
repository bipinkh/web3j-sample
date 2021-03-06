package contracts.wrapper;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class SetGetBC extends Contract {
    private static final String BINARY = "60606040526000600255341561001457600080fd5b6104b8806100236000396000f300606060405260043610610078576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680633fcbec151461007d57806360fe47b1146100d25780636d4ce63c146100f55780638bc056091461011e578063de29278914610157578063f0a4e1a214610180575b600080fd5b341561008857600080fd5b610090610243565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156100dd57600080fd5b6100f3600480803590602001909190505061026d565b005b341561010057600080fd5b610108610277565b6040518082815260200191505060405180910390f35b341561012957600080fd5b610155600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050610280565b005b341561016257600080fd5b61016a6102c4565b6040518082815260200191505060405180910390f35b341561018b57600080fd5b610229600480803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509190803590602001909190803573ffffffffffffffffffffffffffffffffffffffff1690602001909190803560ff1690602001909190803560001916906020019091908035600019169060200190919050506102ce565b604051808215151515815260200191505060405180910390f35b6000600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905090565b8060008190555050565b60008054905090565b80600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555050565b6000600254905090565b60008060008888886040518084805190602001908083835b60208310151561030b57805182526020820191506020810190506020830392506102e6565b6001836020036101000a0380198251168184511680821785525050505050509050018381526020018273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166c01000000000000000000000000028152601401935050505060405180910390209150600182878787604051600081526020016040526000604051602001526040518085600019166000191681526020018460ff1660ff16815260200183600019166000191681526020018260001916600019168152602001945050505050602060405160208103908084039060008661646e5a03f1151561040157600080fd5b50506020604051035190508073ffffffffffffffffffffffffffffffffffffffff16600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515610473576002808190555060009250610480565b6001600281905550600192505b505096955050505050505600a165627a7a72305820a89395f0df44cd93b9b597f0e96ebada353e2cde623ee60037762d7fb5045eb90029";

    protected SetGetBC(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SetGetBC(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> getNotaryAddress() {
        Function function = new Function("getNotaryAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> set(BigInteger a) {
        Function function = new Function(
                "set", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> get() {
        Function function = new Function("get", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setNotaryAddress(String not) {
        Function function = new Function(
                "setNotaryAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(not)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getResult() {
        Function function = new Function("getResult", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> checkHash(String msgString, BigInteger msgUint, String msgAddrs, BigInteger v, byte[] r, byte[] s) {
        Function function = new Function(
                "checkHash", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(msgString), 
                new org.web3j.abi.datatypes.generated.Uint256(msgUint), 
                new org.web3j.abi.datatypes.Address(msgAddrs), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<SetGetBC> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(SetGetBC.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<SetGetBC> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(SetGetBC.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static SetGetBC load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SetGetBC(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static SetGetBC load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SetGetBC(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
