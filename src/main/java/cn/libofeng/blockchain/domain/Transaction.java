package cn.libofeng.blockchain.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction implements Serializable {
    private String sender;
    private String recipient;
    private BigDecimal amount;
}
