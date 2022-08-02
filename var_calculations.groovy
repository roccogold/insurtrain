import org.camunda.spin.json.SpinJsonNode; 
import org.camunda.spin.SpinList;
import static org.camunda.spin.Spin.*;

#indemnity_formula
if (infoPolicy_travelDistance < 100) { indemnity = infoPolicy_price*0.5;
}
if (infoPolicy_travelDistance < 200) { indemnity = infoPolicy_price*0.8;
}
if (infoPolicy_travelDistance > 201) {
indemnity = infoPolicy_price*((100+infoPolicy_travelDistance/100)/100); }
intIndemnity = indemnity.intValue();
return intIndemnity;

#premium_formula
if (infoPolicy_travelDistance < 100) { premium = infoPolicy_price*0.05;
}
if (infoPolicy_travelDistance < 200) { premium = infoPolicy_price*0.06;
}
if (infoPolicy_travelDistance > 201) { premium = infoPolicy_price*0.07;
}
intPremium = premium.intValue();
return intPremium;

#delay_formula
delay = (infoPolicy_arrivalUnix_API - infoPolicy_arrivalUnix);
if (delay > 600) {
late = true;
}
else {
late = false;
}
return late;