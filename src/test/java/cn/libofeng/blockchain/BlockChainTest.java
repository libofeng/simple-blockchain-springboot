package cn.libofeng.blockchain;


import cn.libofeng.blockchain.domain.Block;
import cn.libofeng.blockchain.core.BlockChain;
import cn.libofeng.blockchain.domain.Transaction;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


public class BlockChainTest {

    private BlockChain blockChain = new BlockChain();

    @Test
    public void createTransaction() {
        Transaction transaction = new Transaction(UUID.randomUUID().toString(), UUID.randomUUID().toString(), BigDecimal.valueOf(1000.00));

        assertThat(blockChain.createTransaction(transaction)).isGreaterThan(0);
    }

    @Test
    public void createBlock() {
        Block block = new Block(100, null);

        Block createdBlock = blockChain.createBlock(block);

        assertThat(createdBlock).isNotNull();
        assertThat(createdBlock.getIndex()).isEqualTo(2);
        assertThat(createdBlock.getProof()).isEqualTo(100L);
        assertThat(createdBlock.getTimestamp()).isLessThan(System.currentTimeMillis());
        assertThat(createdBlock.getPreviousHash()).isNotBlank();
    }
}
