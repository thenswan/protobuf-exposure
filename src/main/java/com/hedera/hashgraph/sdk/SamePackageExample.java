package com.hedera.hashgraph.sdk;

import com.hedera.hashgraph.sdk.proto.AccountID;
import com.hedera.hashgraph.sdk.proto.SchedulableTransactionBody;
import com.hedera.hashgraph.sdk.proto.TransactionBody;
import com.hedera.hashgraph.sdk.proto.TransactionResponse;
import io.grpc.MethodDescriptor;

public class SamePackageExample {
    public static void main(String[] args) {

        // if class is defined in package com.hedera.hashgraph.sdk:

        // it is possible to access package protected methods that expose protobuf objects
        AccountId.fromProtobuf(AccountID.newBuilder().build());

        // it is possible to extend Transaction class and access protected protobuf objects
        new ExampleTransaction();
    }
}

// can extend transaction and access protobuf objects if class is defined in package com.hedera.hashgraph.sdk
class ExampleTransaction extends Transaction<ExampleTransaction> {

    public ExampleTransaction() {
        this.outerTransactions.clear();
    }

    @Override
    void validateChecksums(Client client) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    MethodDescriptor<com.hedera.hashgraph.sdk.proto.Transaction, TransactionResponse> getMethodDescriptor() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    void onFreeze(TransactionBody.Builder bodyBuilder) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    void onScheduled(SchedulableTransactionBody.Builder scheduled) {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
