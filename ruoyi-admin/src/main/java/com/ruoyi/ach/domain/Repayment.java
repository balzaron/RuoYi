package com.ruoyi.ach.domain;

//import com.sdxd.common.web.vo.RestRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

@ApiModel("主动还款")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class Repayment {

    @ApiModelProperty("订单ID")
    @NotEmpty(message = "订单ID未填写")
    private String order_id;

    @ApiModelProperty("期数")
    @NotNull(message = "期数未填写")
    private List<Integer> periods;

    @ApiModelProperty("绑卡ID")
    @NotEmpty(message = "绑卡ID未填写")
    private String bind_id;
}
