package com.example;

import com.hedera.hashgraph.sdk.TokenSupplyType;
import com.hedera.hashgraph.sdk.TokenType;
import com.hedera.hashgraph.sdk.Transaction;

public class SimpleExposure {
    public static void main(String[] args) {
        // access to protobuf objects
        var protobufObject = com.hedera.hashgraph.sdk.proto.SchedulableTransactionBody.newBuilder().build();

        // public method that accepts protobuf object
        Transaction.fromScheduledTransaction(protobufObject);

        // access to `toProtobuf()` method of some enums
        TokenSupplyType.FINITE.toProtobuf();
        TokenType.FUNGIBLE_COMMON.toProtobuf();
    }
}
