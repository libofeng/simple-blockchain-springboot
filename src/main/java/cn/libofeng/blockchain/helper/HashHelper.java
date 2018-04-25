package cn.libofeng.blockchain.helper;

import cn.libofeng.blockchain.domain.Block;
import com.alibaba.fastjson.JSON;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class HashHelper {

    public static String hashBlock(Block block) {
        return hash(JSON.toJSONString(block));
    }

    public static String hash(String content) {
        String hash = Hashing
                .sha256()
                .hashString(content, StandardCharsets.UTF_8)
                .toString();

        return hash;
    }
}
