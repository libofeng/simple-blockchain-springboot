package cn.libofeng.blockchain.dto;

import cn.libofeng.blockchain.domain.Block;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BlockChainResponseDTO implements Serializable {
    private List<Block> chain;
    private int length;

    public BlockChainResponseDTO(List<Block> chain) {
        this.chain = chain;
        this.length = chain.size();
    }
}
