package cn.libofeng.blockchain.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Block implements Serializable {
    private long index;

    private long timestamp;

    private List<Transaction> transactions;

    private long proof;

    private String previousHash;

    public Block(long proof, String previousHash) {
        this.proof = proof;
        this.previousHash = previousHash;
    }
}
