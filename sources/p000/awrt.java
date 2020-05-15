package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.cast.JGCastService;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.IntermediatePaymentData;
import com.google.android.gms.wallet.callback.PaymentAuthorizationResult;
import com.google.android.gms.wallet.callback.PaymentDataRequestUpdate;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: awrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awrt {

    /* renamed from: a */
    public static final ExecutorService f94941a = snp.m35702a(10);

    /* renamed from: b */
    public static final Map f94942b = sqw.m36035a((Object[]) new Integer[]{1, 2, 6, 3, 4, 5}, (Object[]) new Integer[]{3, 4, 9, 5, 6, 7});

    /* renamed from: c */
    private static final bnic f94943c = bniq.m109552a((Comparable) "CARD", (Comparable) "PAYPAL");

    /* renamed from: d */
    private static final Pattern f94944d = Pattern.compile((String) awjl.f94547i.mo58455c());

    /* renamed from: e */
    private static final Pattern f94945e = Pattern.compile(chgl.f188589a.mo6606a().mo85214a());

    private awrt() {
    }

    /* renamed from: a */
    public static int m80803a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 4;
                }
                if (i != 4) {
                    return i != 5 ? 1000 : 6;
                }
                return 5;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static boolean m80847a(int i, int i2, int i3, int i4) {
        return i > i3 || (i == i3 && i2 > i4);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:289:0x0659 */
    /* JADX WARN: Type inference failed for: r2v0, assign insn: 0x000d: CONST  (r2v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int], assign insn: PHI: (r2v1 ?) = (r2v0 ?), (r2v2 ?), (r2v265 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:7:0x001e, B:289:0x0659, B:5:0x001a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int], assign insn: PHI: (r2v2 ?) = (r2v3 ?), (r2v4 ?), (r2v5 ?), (r2v6 ?), (r2v7 ?), (r2v8 ?), (r2v9 ?), (r2v10 ?), (r2v11 ?), (r2v12 ?), (r2v13 ?), (r2v14 ?), (r2v15 ?), (r2v16 ?), (r2v17 ?), (r2v18 ?), (r2v19 ?), (r2v20 ?), (r2v21 ?), (r2v22 ?), (r2v23 ?), (r2v24 ?), (r2v25 ?), (r2v26 ?), (r2v27 ?), (r2v28 ?), (r2v29 ?), (r2v30 ?), (r2v31 ?), (r2v32 ?), (r2v33 ?), (r2v34 ?), (r2v35 ?), (r2v36 ?), (r2v37 ?), (r2v38 ?), (r2v39 ?), (r2v40 ?), (r2v41 ?), (r2v42 ?), (r2v43 ?), (r2v44 ?), (r2v45 ?), (r2v46 ?), (r2v47 ?), (r2v48 ?), (r2v49 ?), (r2v50 ?), (r2v51 ?), (r2v52 ?), (r2v53 ?), (r2v54 ?), (r2v55 ?), (r2v56 ?), (r2v57 ?), (r2v58 ?), (r2v59 ?), (r2v60 ?), (r2v61 ?), (r2v62 ?), (r2v63 ?), (r2v64 ?), (r2v65 ?), (r2v66 ?), (r2v67 ?), (r2v68 ?), (r2v69 ?), (r2v70 ?), (r2v71 ?), (r2v72 ?), (r2v73 ?), (r2v74 ?), (r2v75 ?), (r2v76 ?), (r2v77 ?), (r2v78 ?), (r2v79 ?), (r2v80 ?), (r2v81 ?), (r2v82 ?), (r2v83 ?), (r2v84 ?), (r2v85 ?), (r2v86 ?), (r2v87 ?), (r2v88 ?), (r2v89 ?), (r2v90 ?), (r2v91 ?), (r2v92 ?), (r2v93 ?), (r2v94 ?), (r2v95 ?), (r2v96 ?), (r2v97 ?), (r2v98 ?), (r2v99 ?), (r2v100 ?), (r2v101 ?), (r2v102 ?), (r2v103 ?), (r2v104 ?), (r2v105 ?), (r2v106 ?), (r2v107 ?), (r2v108 ?), (r2v109 ?), (r2v110 ?), (r2v111 ?), (r2v112 ?), (r2v113 ?), (r2v114 ?), (r2v115 ?), (r2v116 ?), (r2v117 ?), (r2v118 ?), (r2v119 ?), (r2v120 ?), (r2v121 ?), (r2v122 ?), (r2v123 ?), (r2v124 ?), (r2v125 ?), (r2v126 ?), (r2v127 ?), (r2v128 ?), (r2v129 ?), (r2v130 ?), (r2v131 ?), (r2v132 ?), (r2v133 ?), (r2v134 ?), (r2v135 ?), (r2v136 ?), (r2v137 ?), (r2v138 ?), (r2v139 ?), (r2v140 ?), (r2v141 ?), (r2v142 ?), (r2v143 ?), (r2v144 ?), (r2v145 ?), (r2v146 ?), (r2v147 ?), (r2v148 ?), (r2v149 ?), (r2v150 ?), (r2v151 ?), (r2v152 ?), (r2v153 ?), (r2v154 ?), (r2v155 ?), (r2v156 ?), (r2v157 ?), (r2v158 ?), (r2v159 ?), (r2v160 ?), (r2v161 ?), (r2v162 ?), (r2v163 ?), (r2v164 ?), (r2v165 ?), (r2v166 ?), (r2v167 ?), (r2v168 ?), (r2v169 ?), (r2v170 ?), (r2v171 ?), (r2v172 ?), (r2v173 ?), (r2v174 ?), (r2v175 ?), (r2v176 ?), (r2v177 ?), (r2v178 ?), (r2v179 ?), (r2v180 ?), (r2v181 ?), (r2v182 ?), (r2v183 ?), (r2v184 ?), (r2v185 ?), (r2v186 ?), (r2v187 ?), (r2v188 ?), (r2v189 ?), (r2v190 ?), (r2v191 ?), (r2v192 ?), (r2v193 ?), (r2v194 ?), (r2v195 ?), (r2v196 ?), (r2v197 ?), (r2v198 ?), (r2v199 ?), (r2v200 ?), (r2v201 ?), (r2v202 ?), (r2v203 ?), (r2v204 ?), (r2v205 ?), (r2v206 ?), (r2v207 ?), (r2v208 ?), (r2v209 ?), (r2v210 ?), (r2v211 ?), (r2v212 ?), (r2v213 ?), (r2v214 ?), (r2v215 ?), (r2v216 ?), (r2v217 ?), (r2v218 ?), (r2v219 ?), (r2v220 ?), (r2v221 ?), (r2v222 ?), (r2v223 ?), (r2v224 ?), (r2v225 ?), (r2v226 ?), (r2v227 ?), (r2v228 ?), (r2v229 ?), (r2v230 ?), (r2v231 ?), (r2v232 ?), (r2v233 ?), (r2v234 ?), (r2v235 ?), (r2v236 ?), (r2v237 ?), (r2v238 ?), (r2v239 ?), (r2v240 ?), (r2v241 ?), (r2v242 ?), (r2v243 ?), (r2v244 ?), (r2v245 ?), (r2v246 ?), (r2v247 ?), (r2v248 ?), (r2v249 ?), (r2v250 ?), (r2v251 ?), (r2v252 ?), (r2v253 ?), (r2v254 ?), (r2v255 ?), (r2v256 ?), (r2v257 ?), (r2v258 ?), (r2v259 ?), (r2v260 ?), (r2v261 ?), (r2v262 ?), (r2v263 ?), (r2v264 ?), (r2v266 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:288:0x0655, B:287:0x0650, B:286:0x064b, B:285:0x0646, B:284:0x0641, B:283:0x063c, B:282:0x0637, B:281:0x0634, B:280:0x062f, B:279:0x062a, B:278:0x0627, B:277:0x0622, B:276:0x061d, B:275:0x0618, B:274:0x0613, B:273:0x0610, B:272:0x060b, B:271:0x0608, B:270:0x0603, B:269:0x05fe, B:268:0x05f8, B:267:0x05f2, B:266:0x05ec, B:265:0x05e6, B:264:0x05e0, B:263:0x05da, B:262:0x05d4, B:261:0x05ce, B:260:0x05c8, B:259:0x05c2, B:258:0x05bc, B:257:0x05b6, B:256:0x05b2, B:255:0x05ac, B:254:0x05a6, B:253:0x05a0, B:252:0x059a, B:251:0x0594, B:250:0x058e, B:249:0x0588, B:248:0x0582, B:247:0x057c, B:246:0x0576, B:245:0x0570, B:244:0x056a, B:243:0x0564, B:242:0x055e, B:241:0x0558, B:240:0x0552, B:239:0x054c, B:238:0x0546, B:237:0x0540, B:236:0x053a, B:235:0x0536, B:234:0x0530, B:233:0x052a, B:232:0x0524, B:231:0x051e, B:230:0x0518, B:229:0x0512, B:228:0x050c, B:227:0x0506, B:226:0x0500, B:225:0x04fa, B:224:0x04f4, B:223:0x04ee, B:222:0x04e8, B:221:0x04e2, B:220:0x04dc, B:219:0x04d6, B:218:0x04d0, B:217:0x04ca, B:216:0x04c4, B:215:0x04be, B:214:0x04b8, B:213:0x04b2, B:212:0x04ac, B:211:0x04a6, B:210:0x04a0, B:209:0x049a, B:208:0x0494, B:207:0x048e, B:206:0x0488, B:205:0x0482, B:204:0x047c, B:203:0x0476, B:202:0x0470, B:201:0x046a, B:200:0x0464, B:199:0x045e, B:198:0x0458, B:197:0x0452, B:196:0x044c, B:195:0x0446, B:194:0x0440, B:193:0x043a, B:192:0x0434, B:191:0x042e, B:190:0x0428, B:189:0x0422, B:188:0x041c, B:187:0x0416, B:186:0x0410, B:185:0x040a, B:184:0x0404, B:183:0x03fe, B:182:0x03f8, B:181:0x03f2, B:180:0x03ec, B:179:0x03e6, B:178:0x03e0, B:177:0x03da, B:176:0x03d4, B:175:0x03ce, B:174:0x03c8, B:173:0x03c2, B:172:0x03bc, B:171:0x03b6, B:170:0x03b0, B:169:0x03aa, B:168:0x03a4, B:167:0x039e, B:166:0x0398, B:165:0x0392, B:164:0x038c, B:163:0x0386, B:162:0x0380, B:161:0x037a, B:160:0x0374, B:159:0x036e, B:158:0x0368, B:157:0x0362, B:156:0x035c, B:155:0x0356, B:154:0x0350, B:153:0x034a, B:152:0x0344, B:151:0x033e, B:150:0x0338, B:149:0x0332, B:148:0x032c, B:147:0x0326, B:146:0x0320, B:145:0x031a, B:144:0x0314, B:143:0x030e, B:142:0x0308, B:141:0x0302, B:140:0x02fc, B:139:0x02f6, B:138:0x02f0, B:137:0x02ea, B:136:0x02e4, B:135:0x02de, B:134:0x02d8, B:133:0x02d2, B:132:0x02cc, B:131:0x02c6, B:130:0x02c0, B:129:0x02ba, B:128:0x02b4, B:127:0x02ae, B:126:0x02a8, B:125:0x02a2, B:124:0x029c, B:123:0x0296, B:122:0x0290, B:121:0x028a, B:120:0x0284, B:119:0x027e, B:118:0x0278, B:117:0x0272, B:116:0x026c, B:115:0x0266, B:114:0x0260, B:113:0x025a, B:112:0x0254, B:111:0x024e, B:110:0x0248, B:109:0x0242, B:108:0x023e, B:107:0x0238, B:106:0x0232, B:105:0x022c, B:104:0x0226, B:103:0x0220, B:102:0x021a, B:101:0x0214, B:100:0x020e, B:99:0x0208, B:98:0x0202, B:97:0x01fc, B:96:0x01f6, B:95:0x01f0, B:94:0x01ea, B:93:0x01e4, B:92:0x01de, B:91:0x01d8, B:90:0x01d2, B:89:0x01cc, B:88:0x01c6, B:87:0x01c0, B:86:0x01ba, B:85:0x01b4, B:84:0x01ae, B:83:0x01a8, B:82:0x01a2, B:81:0x019c, B:80:0x0198, B:79:0x0192, B:78:0x018c, B:77:0x0186, B:76:0x0180, B:75:0x017a, B:74:0x0174, B:73:0x016e, B:72:0x0168, B:71:0x0162, B:70:0x015c, B:69:0x0156, B:68:0x0150, B:67:0x014c, B:66:0x0146, B:65:0x0140, B:64:0x013a, B:63:0x0134, B:62:0x012e, B:61:0x0128, B:60:0x0122, B:59:0x011c, B:58:0x0116, B:57:0x0110, B:56:0x010a, B:55:0x0104, B:54:0x00fe, B:53:0x00f8, B:52:0x00f2, B:51:0x00ec, B:50:0x00e6, B:49:0x00e0, B:48:0x00da, B:47:0x00d4, B:29:0x006a, B:46:0x00ce, B:45:0x00c8, B:44:0x00c2, B:43:0x00bc, B:42:0x00b6, B:41:0x00b0, B:40:0x00aa, B:39:0x00a4, B:38:0x009e, B:37:0x0098, B:36:0x0092, B:35:0x008c, B:34:0x0086, B:33:0x0080, B:32:0x007a, B:31:0x0074, B:30:0x006e, B:28:0x0064, B:27:0x005e, B:26:0x0059] */
    /* JADX WARN: Type inference failed for: r2v3, assign insn: 0x0657: CONST  (r2v3 ? I:?[int, float, short, byte, char]) = (533(0x215, float:7.47E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v4, assign insn: 0x0652: CONST  (r2v4 ? I:?[int, float, short, byte, char]) = (248(0xf8, float:3.48E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v5, assign insn: 0x064d: CONST  (r2v5 ? I:?[int, float, short, byte, char]) = (70 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v6, assign insn: 0x0648: CONST  (r2v6 ? I:?[int, float, short, byte, char]) = (52 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v7, assign insn: 0x0643: CONST  (r2v7 ? I:?[int, float, short, byte, char]) = (112(0x70, float:1.57E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v8, assign insn: 0x063e: CONST  (r2v8 ? I:?[int, float, short, byte, char]) = (84 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v9, assign insn: 0x0639: CONST  (r2v9 ? I:?[int, float, short, byte, char]) = (166(0xa6, float:2.33E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v10, assign insn: 0x0634: CONST  (r2v10 ? I:?[int, float, short, byte, char]) = (180(0xb4, float:2.52E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v11, assign insn: 0x0631: CONST  (r2v11 ? I:?[int, float, short, byte, char]) = (20 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v12, assign insn: 0x062c: CONST  (r2v12 ? I:?[int, float, short, byte, char]) = (784(0x310, float:1.099E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v13, assign insn: 0x0628: CONST  (r2v13 ? I:?[int, float, short, byte, char]) = (4 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v14, assign insn: 0x0624: CONST  (r2v14 ? I:?[int, float, short, byte, char]) = (28 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v15, assign insn: 0x061f: CONST  (r2v15 ? I:?[int, float, short, byte, char]) = (660(0x294, float:9.25E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v16, assign insn: 0x061a: CONST  (r2v16 ? I:?[int, float, short, byte, char]) = (31 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v17, assign insn: 0x0615: CONST  (r2v17 ? I:?[int, float, short, byte, char]) = (50 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v18, assign insn: 0x0610: CONST  (r2v18 ? I:?[int, float, short, byte, char]) = (56 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v19, assign insn: 0x060d: CONST  (r2v19 ? I:?[int, float, short, byte, char]) = (854(0x356, float:1.197E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v20, assign insn: 0x0608: CONST  (r2v20 ? I:?[int, float, short, byte, char]) = (100 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v21, assign insn: 0x0605: CONST  (r2v21 ? I:?[int, float, short, byte, char]) = (48 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v22, assign insn: 0x0600: CONST  (r2v22 ? I:?[int, float, short, byte, char]) = (108(0x6c, float:1.51E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v23, assign insn: 0x05fa: CONST  (r2v23 ? I:?[int, float, short, byte, char]) = (204(0xcc, float:2.86E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v24, assign insn: 0x05f4: CONST  (r2v24 ? I:?[int, float, short, byte, char]) = (124(0x7c, float:1.74E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v25, assign insn: 0x05ee: CONST  (r2v25 ? I:?[int, float, short, byte, char]) = (140(0x8c, float:1.96E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v26, assign insn: 0x05e8: CONST  (r2v26 ? I:?[int, float, short, byte, char]) = (178(0xb2, float:2.5E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v27, assign insn: 0x05e2: CONST  (r2v27 ? I:?[int, float, short, byte, char]) = (756(0x2f4, float:1.06E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v28, assign insn: 0x05dc: CONST  (r2v28 ? I:?[int, float, short, byte, char]) = (384(0x180, float:5.38E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v29, assign insn: 0x05d6: CONST  (r2v29 ? I:?[int, float, short, byte, char]) = (184(0xb8, float:2.58E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v30, assign insn: 0x05d0: CONST  (r2v30 ? I:?[int, float, short, byte, char]) = (152(0x98, float:2.13E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v31, assign insn: 0x05ca: CONST  (r2v31 ? I:?[int, float, short, byte, char]) = (120(0x78, float:1.68E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v32, assign insn: 0x05c4: CONST  (r2v32 ? I:?[int, float, short, byte, char]) = (156(0x9c, float:2.19E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v33, assign insn: 0x05be: CONST  (r2v33 ? I:?[int, float, short, byte, char]) = (170(0xaa, float:2.38E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v34, assign insn: 0x05b8: CONST  (r2v34 ? I:?[int, float, short, byte, char]) = (188(0xbc, float:2.63E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v35, assign insn: 0x05b2: CONST  (r2v35 ? I:?[int, float, short, byte, char]) = (891(0x37b, float:1.249E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v36, assign insn: 0x05ae: CONST  (r2v36 ? I:?[int, float, short, byte, char]) = (192(0xc0, float:2.69E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v37, assign insn: 0x05a8: CONST  (r2v37 ? I:?[int, float, short, byte, char]) = (132(0x84, float:1.85E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v38, assign insn: 0x05a2: CONST  (r2v38 ? I:?[int, float, short, byte, char]) = (531(0x213, float:7.44E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v39, assign insn: 0x059c: CONST  (r2v39 ? I:?[int, float, short, byte, char]) = (162(0xa2, float:2.27E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v40, assign insn: 0x0596: CONST  (r2v40 ? I:?[int, float, short, byte, char]) = (196(0xc4, float:2.75E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v41, assign insn: 0x0590: CONST  (r2v41 ? I:?[int, float, short, byte, char]) = (203(0xcb, float:2.84E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v42, assign insn: 0x058a: CONST  (r2v42 ? I:?[int, float, short, byte, char]) = (278(0x116, float:3.9E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v43, assign insn: 0x0584: CONST  (r2v43 ? I:?[int, float, short, byte, char]) = (276(0x114, float:3.87E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v44, assign insn: 0x057e: CONST  (r2v44 ? I:?[int, float, short, byte, char]) = (262(0x106, float:3.67E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v45, assign insn: 0x0578: CONST  (r2v45 ? I:?[int, float, short, byte, char]) = (208(0xd0, float:2.91E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v46, assign insn: 0x0572: CONST  (r2v46 ? I:?[int, float, short, byte, char]) = (212(0xd4, float:2.97E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v47, assign insn: 0x056c: CONST  (r2v47 ? I:?[int, float, short, byte, char]) = (214(0xd6, float:3.0E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v48, assign insn: 0x0566: CONST  (r2v48 ? I:?[int, float, short, byte, char]) = (12 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v49, assign insn: 0x0560: CONST  (r2v49 ? I:?[int, float, short, byte, char]) = (218(0xda, float:3.05E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v50, assign insn: 0x055a: CONST  (r2v50 ? I:?[int, float, short, byte, char]) = (233(0xe9, float:3.27E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v51, assign insn: 0x0554: CONST  (r2v51 ? I:?[int, float, short, byte, char]) = (818(0x332, float:1.146E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v52, assign insn: 0x054e: CONST  (r2v52 ? I:?[int, float, short, byte, char]) = (732(0x2dc, float:1.026E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v53, assign insn: 0x0548: CONST  (r2v53 ? I:?[int, float, short, byte, char]) = (232(0xe8, float:3.25E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v54, assign insn: 0x0542: CONST  (r2v54 ? I:?[int, float, short, byte, char]) = (724(0x2d4, float:1.015E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v55, assign insn: 0x053c: CONST  (r2v55 ? I:?[int, float, short, byte, char]) = (231(0xe7, float:3.24E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v56, assign insn: 0x0536: CONST  (r2v56 ? I:?[int, float, short, byte, char]) = (967(0x3c7, float:1.355E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v57, assign insn: 0x0532: CONST  (r2v57 ? I:?[int, float, short, byte, char]) = (246(0xf6, float:3.45E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v58, assign insn: 0x052c: CONST  (r2v58 ? I:?[int, float, short, byte, char]) = (242(0xf2, float:3.39E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v59, assign insn: 0x0526: CONST  (r2v59 ? I:?[int, float, short, byte, char]) = (238(0xee, float:3.34E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v60, assign insn: 0x0520: CONST  (r2v60 ? I:?[int, float, short, byte, char]) = (583(0x247, float:8.17E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v61, assign insn: 0x051a: CONST  (r2v61 ? I:?[int, float, short, byte, char]) = (234(0xea, float:3.28E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v62, assign insn: 0x0514: CONST  (r2v62 ? I:?[int, float, short, byte, char]) = (250(0xfa, float:3.5E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v63, assign insn: 0x050e: CONST  (r2v63 ? I:?[int, float, short, byte, char]) = (249(0xf9, float:3.49E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v64, assign insn: 0x0508: CONST  (r2v64 ? I:?[int, float, short, byte, char]) = (266(0x10a, float:3.73E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v65, assign insn: 0x0502: CONST  (r2v65 ? I:?[int, float, short, byte, char]) = (826(0x33a, float:1.157E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v66, assign insn: 0x04fc: CONST  (r2v66 ? I:?[int, float, short, byte, char]) = (308(0x134, float:4.32E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v67, assign insn: 0x04f6: CONST  (r2v67 ? I:?[int, float, short, byte, char]) = (268(0x10c, float:3.76E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v68, assign insn: 0x04f0: CONST  (r2v68 ? I:?[int, float, short, byte, char]) = (254(0xfe, float:3.56E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v69, assign insn: 0x04ea: CONST  (r2v69 ? I:?[int, float, short, byte, char]) = (831(0x33f, float:1.164E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v70, assign insn: 0x04e4: CONST  (r2v70 ? I:?[int, float, short, byte, char]) = (288(0x120, float:4.04E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v71, assign insn: 0x04de: CONST  (r2v71 ? I:?[int, float, short, byte, char]) = (292(0x124, float:4.09E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v72, assign insn: 0x04d8: CONST  (r2v72 ? I:?[int, float, short, byte, char]) = (304(0x130, float:4.26E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v73, assign insn: 0x04d2: CONST  (r2v73 ? I:?[int, float, short, byte, char]) = (270(0x10e, float:3.78E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v74, assign insn: 0x04cc: CONST  (r2v74 ? I:?[int, float, short, byte, char]) = (324(0x144, float:4.54E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v75, assign insn: 0x04c6: CONST  (r2v75 ? I:?[int, float, short, byte, char]) = (312(0x138, float:4.37E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v76, assign insn: 0x04c0: CONST  (r2v76 ? I:?[int, float, short, byte, char]) = (226(0xe2, float:3.17E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v77, assign insn: 0x04ba: CONST  (r2v77 ? I:?[int, float, short, byte, char]) = (300(0x12c, float:4.2E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v78, assign insn: 0x04b4: CONST  (r2v78 ? I:?[int, float, short, byte, char]) = (239(0xef, float:3.35E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v79, assign insn: 0x04ae: CONST  (r2v79 ? I:?[int, float, short, byte, char]) = (320(0x140, float:4.48E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v80, assign insn: 0x04a8: CONST  (r2v80 ? I:?[int, float, short, byte, char]) = (316(0x13c, float:4.43E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v81, assign insn: 0x04a2: CONST  (r2v81 ? I:?[int, float, short, byte, char]) = (624(0x270, float:8.74E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v82, assign insn: 0x049c: CONST  (r2v82 ? I:?[int, float, short, byte, char]) = (328(0x148, float:4.6E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v83, assign insn: 0x0496: CONST  (r2v83 ? I:?[int, float, short, byte, char]) = (344(0x158, float:4.82E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v84, assign insn: 0x0490: CONST  (r2v84 ? I:?[int, float, short, byte, char]) = (334(0x14e, float:4.68E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v85, assign insn: 0x048a: CONST  (r2v85 ? I:?[int, float, short, byte, char]) = (340(0x154, float:4.76E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v86, assign insn: 0x0484: CONST  (r2v86 ? I:?[int, float, short, byte, char]) = (191(0xbf, float:2.68E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v87, assign insn: 0x047e: CONST  (r2v87 ? I:?[int, float, short, byte, char]) = (332(0x14c, float:4.65E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v88, assign insn: 0x0478: CONST  (r2v88 ? I:?[int, float, short, byte, char]) = (348(0x15c, float:4.88E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v89, assign insn: 0x0472: CONST  (r2v89 ? I:?[int, float, short, byte, char]) = (360(0x168, float:5.04E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v90, assign insn: 0x046c: CONST  (r2v90 ? I:?[int, float, short, byte, char]) = (372(0x174, float:5.21E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v91, assign insn: 0x0466: CONST  (r2v91 ? I:?[int, float, short, byte, char]) = (376(0x178, float:5.27E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v92, assign insn: 0x0460: CONST  (r2v92 ? I:?[int, float, short, byte, char]) = (833(0x341, float:1.167E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v93, assign insn: 0x045a: CONST  (r2v93 ? I:?[int, float, short, byte, char]) = (356(0x164, float:4.99E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v94, assign insn: 0x0454: CONST  (r2v94 ? I:?[int, float, short, byte, char]) = (86 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v95, assign insn: 0x044e: CONST  (r2v95 ? I:?[int, float, short, byte, char]) = (368(0x170, float:5.16E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v96, assign insn: 0x0448: CONST  (r2v96 ? I:?[int, float, short, byte, char]) = (364(0x16c, float:5.1E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v97, assign insn: 0x0442: CONST  (r2v97 ? I:?[int, float, short, byte, char]) = (352(0x160, float:4.93E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v98, assign insn: 0x043c: CONST  (r2v98 ? I:?[int, float, short, byte, char]) = (380(0x17c, float:5.32E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v99, assign insn: 0x0436: CONST  (r2v99 ? I:?[int, float, short, byte, char]) = (832(0x340, float:1.166E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v100, assign insn: 0x0430: CONST  (r2v100 ? I:?[int, float, short, byte, char]) = (388(0x184, float:5.44E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v101, assign insn: 0x042a: CONST  (r2v101 ? I:?[int, float, short, byte, char]) = (400(0x190, float:5.6E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v102, assign insn: 0x0424: CONST  (r2v102 ? I:?[int, float, short, byte, char]) = (392(0x188, float:5.5E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v103, assign insn: 0x041e: CONST  (r2v103 ? I:?[int, float, short, byte, char]) = (404(0x194, float:5.66E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v104, assign insn: 0x0418: CONST  (r2v104 ? I:?[int, float, short, byte, char]) = (417(0x1a1, float:5.84E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v105, assign insn: 0x0412: CONST  (r2v105 ? I:?[int, float, short, byte, char]) = (116(0x74, float:1.63E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v106, assign insn: 0x040c: CONST  (r2v106 ? I:?[int, float, short, byte, char]) = (296(0x128, float:4.15E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v107, assign insn: 0x0406: CONST  (r2v107 ? I:?[int, float, short, byte, char]) = (174(0xae, float:2.44E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v108, assign insn: 0x0400: CONST  (r2v108 ? I:?[int, float, short, byte, char]) = (659(0x293, float:9.23E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v109, assign insn: 0x03fa: CONST  (r2v109 ? I:?[int, float, short, byte, char]) = (408(0x198, float:5.72E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v110, assign insn: 0x03f4: CONST  (r2v110 ? I:?[int, float, short, byte, char]) = (410(0x19a, float:5.75E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v111, assign insn: 0x03ee: CONST  (r2v111 ? I:?[int, float, short, byte, char]) = (414(0x19e, float:5.8E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v112, assign insn: 0x03e8: CONST  (r2v112 ? I:?[int, float, short, byte, char]) = (136(0x88, float:1.9E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v113, assign insn: 0x03e2: CONST  (r2v113 ? I:?[int, float, short, byte, char]) = (398(0x18e, float:5.58E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v114, assign insn: 0x03dc: CONST  (r2v114 ? I:?[int, float, short, byte, char]) = (418(0x1a2, float:5.86E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v115, assign insn: 0x03d6: CONST  (r2v115 ? I:?[int, float, short, byte, char]) = (422(0x1a6, float:5.91E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v116, assign insn: 0x03d0: CONST  (r2v116 ? I:?[int, float, short, byte, char]) = (662(0x296, float:9.28E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v117, assign insn: 0x03ca: CONST  (r2v117 ? I:?[int, float, short, byte, char]) = (438(0x1b6, float:6.14E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v118, assign insn: 0x03c4: CONST  (r2v118 ? I:?[int, float, short, byte, char]) = (144(0x90, float:2.02E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v119, assign insn: 0x03be: CONST  (r2v119 ? I:?[int, float, short, byte, char]) = (430(0x1ae, float:6.03E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v120, assign insn: 0x03b8: CONST  (r2v120 ? I:?[int, float, short, byte, char]) = (426(0x1aa, float:5.97E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v121, assign insn: 0x03b2: CONST  (r2v121 ? I:?[int, float, short, byte, char]) = (440(0x1b8, float:6.17E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v122, assign insn: 0x03ac: CONST  (r2v122 ? I:?[int, float, short, byte, char]) = (442(0x1ba, float:6.2E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v123, assign insn: 0x03a6: CONST  (r2v123 ? I:?[int, float, short, byte, char]) = (428(0x1ac, float:6.0E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v124, assign insn: 0x03a0: CONST  (r2v124 ? I:?[int, float, short, byte, char]) = (434(0x1b2, float:6.08E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v125, assign insn: 0x039a: CONST  (r2v125 ? I:?[int, float, short, byte, char]) = (504(0x1f8, float:7.06E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v126, assign insn: 0x0394: CONST  (r2v126 ? I:?[int, float, short, byte, char]) = (492(0x1ec, float:6.9E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v127, assign insn: 0x038e: CONST  (r2v127 ? I:?[int, float, short, byte, char]) = (498(0x1f2, float:6.98E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v128, assign insn: 0x0388: CONST  (r2v128 ? I:?[int, float, short, byte, char]) = (499(0x1f3, float:6.99E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v129, assign insn: 0x0382: CONST  (r2v129 ? I:?[int, float, short, byte, char]) = (663(0x297, float:9.29E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v130, assign insn: 0x037c: CONST  (r2v130 ? I:?[int, float, short, byte, char]) = (450(0x1c2, float:6.3E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v131, assign insn: 0x0376: CONST  (r2v131 ? I:?[int, float, short, byte, char]) = (584(0x248, float:8.18E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v132, assign insn: 0x0370: CONST  (r2v132 ? I:?[int, float, short, byte, char]) = (807(0x327, float:1.131E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v133, assign insn: 0x036a: CONST  (r2v133 ? I:?[int, float, short, byte, char]) = (466(0x1d2, float:6.53E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v134, assign insn: 0x0364: CONST  (r2v134 ? I:?[int, float, short, byte, char]) = (496(0x1f0, float:6.95E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v135, assign insn: 0x035e: CONST  (r2v135 ? I:?[int, float, short, byte, char]) = (446(0x1be, float:6.25E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v136, assign insn: 0x0358: CONST  (r2v136 ? I:?[int, float, short, byte, char]) = (580(0x244, float:8.13E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v137, assign insn: 0x0352: CONST  (r2v137 ? I:?[int, float, short, byte, char]) = (474(0x1da, float:6.64E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v138, assign insn: 0x034c: CONST  (r2v138 ? I:?[int, float, short, byte, char]) = (478(0x1de, float:6.7E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v139, assign insn: 0x0346: CONST  (r2v139 ? I:?[int, float, short, byte, char]) = (500(0x1f4, float:7.0E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v140, assign insn: 0x0340: CONST  (r2v140 ? I:?[int, float, short, byte, char]) = (470(0x1d6, float:6.59E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v141, assign insn: 0x033a: CONST  (r2v141 ? I:?[int, float, short, byte, char]) = (480(0x1e0, float:6.73E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v142, assign insn: 0x0334: CONST  (r2v142 ? I:?[int, float, short, byte, char]) = (462(0x1ce, float:6.47E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v143, assign insn: 0x032e: CONST  (r2v143 ? I:?[int, float, short, byte, char]) = (454(0x1c6, float:6.36E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v144, assign insn: 0x0328: CONST  (r2v144 ? I:?[int, float, short, byte, char]) = (484(0x1e4, float:6.78E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v145, assign insn: 0x0322: CONST  (r2v145 ? I:?[int, float, short, byte, char]) = (458(0x1ca, float:6.42E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v146, assign insn: 0x031c: CONST  (r2v146 ? I:?[int, float, short, byte, char]) = (508(0x1fc, float:7.12E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v147, assign insn: 0x0316: CONST  (r2v147 ? I:?[int, float, short, byte, char]) = (516(0x204, float:7.23E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v148, assign insn: 0x0310: CONST  (r2v148 ? I:?[int, float, short, byte, char]) = (540(0x21c, float:7.57E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v149, assign insn: 0x030a: CONST  (r2v149 ? I:?[int, float, short, byte, char]) = (562(0x232, float:7.88E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v150, assign insn: 0x0304: CONST  (r2v150 ? I:?[int, float, short, byte, char]) = (574(0x23e, float:8.04E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v151, assign insn: 0x02fe: CONST  (r2v151 ? I:?[int, float, short, byte, char]) = (566(0x236, float:7.93E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v152, assign insn: 0x02f8: CONST  (r2v152 ? I:?[int, float, short, byte, char]) = (558(0x22e, float:7.82E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v153, assign insn: 0x02f2: CONST  (r2v153 ? I:?[int, float, short, byte, char]) = (528(0x210, float:7.4E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v154, assign insn: 0x02ec: CONST  (r2v154 ? I:?[int, float, short, byte, char]) = (578(0x242, float:8.1E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v155, assign insn: 0x02e6: CONST  (r2v155 ? I:?[int, float, short, byte, char]) = (524(0x20c, float:7.34E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v156, assign insn: 0x02e0: CONST  (r2v156 ? I:?[int, float, short, byte, char]) = (520(0x208, float:7.29E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v157, assign insn: 0x02da: CONST  (r2v157 ? I:?[int, float, short, byte, char]) = (536(0x218, float:7.51E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v158, assign insn: 0x02d4: CONST  (r2v158 ? I:?[int, float, short, byte, char]) = (570(0x23a, float:7.99E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v159, assign insn: 0x02ce: CONST  (r2v159 ? I:?[int, float, short, byte, char]) = (554(0x22a, float:7.76E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v160, assign insn: 0x02c8: CONST  (r2v160 ? I:?[int, float, short, byte, char]) = (512(0x200, float:7.175E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v161, assign insn: 0x02c2: CONST  (r2v161 ? I:?[int, float, short, byte, char]) = (591(0x24f, float:8.28E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v162, assign insn: 0x02bc: CONST  (r2v162 ? I:?[int, float, short, byte, char]) = (604(0x25c, float:8.46E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v163, assign insn: 0x02b6: CONST  (r2v163 ? I:?[int, float, short, byte, char]) = (258(0x102, float:3.62E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v164, assign insn: 0x02b0: CONST  (r2v164 ? I:?[int, float, short, byte, char]) = (598(0x256, float:8.38E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v165, assign insn: 0x02aa: CONST  (r2v165 ? I:?[int, float, short, byte, char]) = (608(0x260, float:8.52E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v166, assign insn: 0x02a4: CONST  (r2v166 ? I:?[int, float, short, byte, char]) = (586(0x24a, float:8.21E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v167, assign insn: 0x029e: CONST  (r2v167 ? I:?[int, float, short, byte, char]) = (616(0x268, float:8.63E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v168, assign insn: 0x0298: CONST  (r2v168 ? I:?[int, float, short, byte, char]) = (666(0x29a, float:9.33E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v169, assign insn: 0x0292: CONST  (r2v169 ? I:?[int, float, short, byte, char]) = (612(0x264, float:8.58E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v170, assign insn: 0x028c: CONST  (r2v170 ? I:?[int, float, short, byte, char]) = (630(0x276, float:8.83E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v171, assign insn: 0x0286: CONST  (r2v171 ? I:?[int, float, short, byte, char]) = (275(0x113, float:3.85E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v172, assign insn: 0x0280: CONST  (r2v172 ? I:?[int, float, short, byte, char]) = (620(0x26c, float:8.69E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v173, assign insn: 0x027a: CONST  (r2v173 ? I:?[int, float, short, byte, char]) = (585(0x249, float:8.2E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v174, assign insn: 0x0274: CONST  (r2v174 ? I:?[int, float, short, byte, char]) = (600(0x258, float:8.41E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v175, assign insn: 0x026e: CONST  (r2v175 ? I:?[int, float, short, byte, char]) = (634(0x27a, float:8.88E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v176, assign insn: 0x0268: CONST  (r2v176 ? I:?[int, float, short, byte, char]) = (961(0x3c1, float:1.347E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v177, assign insn: 0x0262: CONST  (r2v177 ? I:?[int, float, short, byte, char]) = (638(0x27e, float:8.94E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v178, assign insn: 0x025c: CONST  (r2v178 ? I:?[int, float, short, byte, char]) = (642(0x282, float:9.0E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v179, assign insn: 0x0256: CONST  (r2v179 ? I:?[int, float, short, byte, char]) = (688(0x2b0, float:9.64E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v180, assign insn: 0x0250: CONST  (r2v180 ? I:?[int, float, short, byte, char]) = (643(0x283, float:9.01E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v181, assign insn: 0x024a: CONST  (r2v181 ? I:?[int, float, short, byte, char]) = (646(0x286, float:9.05E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v182, assign insn: 0x0244: CONST  (r2v182 ? I:?[int, float, short, byte, char]) = (682(0x2aa, float:9.56E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v183, assign insn: 0x023e: CONST  (r2v183 ? I:?[int, float, short, byte, char]) = (90 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v184, assign insn: 0x023a: CONST  (r2v184 ? I:?[int, float, short, byte, char]) = (690(0x2b2, float:9.67E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v185, assign insn: 0x0234: CONST  (r2v185 ? I:?[int, float, short, byte, char]) = (729(0x2d9, float:1.022E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v186, assign insn: 0x022e: CONST  (r2v186 ? I:?[int, float, short, byte, char]) = (752(0x2f0, float:1.054E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v187, assign insn: 0x0228: CONST  (r2v187 ? I:?[int, float, short, byte, char]) = (702(0x2be, float:9.84E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v188, assign insn: 0x0222: CONST  (r2v188 ? I:?[int, float, short, byte, char]) = (654(0x28e, float:9.16E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v189, assign insn: 0x021c: CONST  (r2v189 ? I:?[int, float, short, byte, char]) = (705(0x2c1, float:9.88E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v190, assign insn: 0x0216: CONST  (r2v190 ? I:?[int, float, short, byte, char]) = (744(0x2e8, float:1.043E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v191, assign insn: 0x0210: CONST  (r2v191 ? I:?[int, float, short, byte, char]) = (703(0x2bf, float:9.85E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v192, assign insn: 0x020a: CONST  (r2v192 ? I:?[int, float, short, byte, char]) = (694(0x2b6, float:9.73E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v193, assign insn: 0x0204: CONST  (r2v193 ? I:?[int, float, short, byte, char]) = (674(0x2a2, float:9.44E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v194, assign insn: 0x01fe: CONST  (r2v194 ? I:?[int, float, short, byte, char]) = (686(0x2ae, float:9.61E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v195, assign insn: 0x01f8: CONST  (r2v195 ? I:?[int, float, short, byte, char]) = (706(0x2c2, float:9.9E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v196, assign insn: 0x01f2: CONST  (r2v196 ? I:?[int, float, short, byte, char]) = (740(0x2e4, float:1.037E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v197, assign insn: 0x01ec: CONST  (r2v197 ? I:?[int, float, short, byte, char]) = (728(0x2d8, float:1.02E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v198, assign insn: 0x01e6: CONST  (r2v198 ? I:?[int, float, short, byte, char]) = (678(0x2a6, float:9.5E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v199, assign insn: 0x01e0: CONST  (r2v199 ? I:?[int, float, short, byte, char]) = (810(0x32a, float:1.135E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v200, assign insn: 0x01da: CONST  (r2v200 ? I:?[int, float, short, byte, char]) = (222(0xde, float:3.11E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v201, assign insn: 0x01d4: CONST  (r2v201 ? I:?[int, float, short, byte, char]) = (534(0x216, float:7.48E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v202, assign insn: 0x01ce: CONST  (r2v202 ? I:?[int, float, short, byte, char]) = (760(0x2f8, float:1.065E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v203, assign insn: 0x01c8: CONST  (r2v203 ? I:?[int, float, short, byte, char]) = (748(0x2ec, float:1.048E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v204, assign insn: 0x01c2: CONST  (r2v204 ? I:?[int, float, short, byte, char]) = (796(0x31c, float:1.115E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v205, assign insn: 0x01bc: CONST  (r2v205 ? I:?[int, float, short, byte, char]) = (148(0x94, float:2.07E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v206, assign insn: 0x01b6: CONST  (r2v206 ? I:?[int, float, short, byte, char]) = (260(0x104, float:3.64E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v207, assign insn: 0x01b0: CONST  (r2v207 ? I:?[int, float, short, byte, char]) = (768(0x300, float:1.076E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v208, assign insn: 0x01aa: CONST  (r2v208 ? I:?[int, float, short, byte, char]) = (764(0x2fc, float:1.07E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v209, assign insn: 0x01a4: CONST  (r2v209 ? I:?[int, float, short, byte, char]) = (762(0x2fa, float:1.068E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v210, assign insn: 0x019e: CONST  (r2v210 ? I:?[int, float, short, byte, char]) = (772(0x304, float:1.082E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v211, assign insn: 0x0198: CONST  (r2v211 ? I:?[int, float, short, byte, char]) = (626(0x272, float:8.77E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v212, assign insn: 0x0194: CONST  (r2v212 ? I:?[int, float, short, byte, char]) = (795(0x31b, float:1.114E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v213, assign insn: 0x018e: CONST  (r2v213 ? I:?[int, float, short, byte, char]) = (788(0x314, float:1.104E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v214, assign insn: 0x0188: CONST  (r2v214 ? I:?[int, float, short, byte, char]) = (776(0x308, float:1.087E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v215, assign insn: 0x0182: CONST  (r2v215 ? I:?[int, float, short, byte, char]) = (792(0x318, float:1.11E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v216, assign insn: 0x017c: CONST  (r2v216 ? I:?[int, float, short, byte, char]) = (780(0x30c, float:1.093E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v217, assign insn: 0x0176: CONST  (r2v217 ? I:?[int, float, short, byte, char]) = (798(0x31e, float:1.118E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v218, assign insn: 0x0170: CONST  (r2v218 ? I:?[int, float, short, byte, char]) = (158(0x9e, float:2.21E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v219, assign insn: 0x016a: CONST  (r2v219 ? I:?[int, float, short, byte, char]) = (834(0x342, float:1.169E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v220, assign insn: 0x0164: CONST  (r2v220 ? I:?[int, float, short, byte, char]) = (804(0x324, float:1.127E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v221, assign insn: 0x015e: CONST  (r2v221 ? I:?[int, float, short, byte, char]) = (800(0x320, float:1.121E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v222, assign insn: 0x0158: CONST  (r2v222 ? I:?[int, float, short, byte, char]) = (581(0x245, float:8.14E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v223, assign insn: 0x0152: CONST  (r2v223 ? I:?[int, float, short, byte, char]) = (840(0x348, float:1.177E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v224, assign insn: 0x014c: CONST  (r2v224 ? I:?[int, float, short, byte, char]) = (858(0x35a, float:1.202E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v225, assign insn: 0x0148: CONST  (r2v225 ? I:?[int, float, short, byte, char]) = (860(0x35c, float:1.205E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v226, assign insn: 0x0142: CONST  (r2v226 ? I:?[int, float, short, byte, char]) = (336(0x150, float:4.71E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v227, assign insn: 0x013c: CONST  (r2v227 ? I:?[int, float, short, byte, char]) = (670(0x29e, float:9.39E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v228, assign insn: 0x0136: CONST  (r2v228 ? I:?[int, float, short, byte, char]) = (862(0x35e, float:1.208E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v229, assign insn: 0x0130: CONST  (r2v229 ? I:?[int, float, short, byte, char]) = (92 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v230, assign insn: 0x012a: CONST  (r2v230 ? I:?[int, float, short, byte, char]) = (850(0x352, float:1.191E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v231, assign insn: 0x0124: CONST  (r2v231 ? I:?[int, float, short, byte, char]) = (704(0x2c0, float:9.87E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v232, assign insn: 0x011e: CONST  (r2v232 ? I:?[int, float, short, byte, char]) = (548(0x224, float:7.68E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v233, assign insn: 0x0118: CONST  (r2v233 ? I:?[int, float, short, byte, char]) = (876(0x36c, float:1.228E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v234, assign insn: 0x0112: CONST  (r2v234 ? I:?[int, float, short, byte, char]) = (882(0x372, float:1.236E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v235, assign insn: 0x010c: CONST  (r2v235 ? I:?[int, float, short, byte, char]) = (973(0x3cd, float:1.363E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v236, assign insn: 0x0106: CONST  (r2v236 ? I:?[int, float, short, byte, char]) = (974(0x3ce, float:1.365E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v237, assign insn: 0x0100: CONST  (r2v237 ? I:?[int, float, short, byte, char]) = (975(0x3cf, float:1.366E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v238, assign insn: 0x00fa: CONST  (r2v238 ? I:?[int, float, short, byte, char]) = (983(0x3d7, float:1.377E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v239, assign insn: 0x00f4: CONST  (r2v239 ? I:?[int, float, short, byte, char]) = (720(0x2d0, float:1.009E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v240, assign insn: 0x00ee: CONST  (r2v240 ? I:?[int, float, short, byte, char]) = (887(0x377, float:1.243E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v241, assign insn: 0x00e8: CONST  (r2v241 ? I:?[int, float, short, byte, char]) = (175(0xaf, float:2.45E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v242, assign insn: 0x00e2: CONST  (r2v242 ? I:?[int, float, short, byte, char]) = (710(0x2c6, float:9.95E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v243, assign insn: 0x00dc: CONST  (r2v243 ? I:?[int, float, short, byte, char]) = (894(0x37e, float:1.253E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v244, assign insn: 0x00d6: CONST  (r2v244 ? I:?[int, float, short, byte, char]) = (716(0x2cc, float:1.003E-42) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v245, assign insn: 0x006a: CONST  (r2v245 ? I:?[int, float, short, byte, char]) = (104(0x68, float:1.46E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v246, assign insn: 0x00d0: CONST  (r2v246 ? I:?[int, float, short, byte, char]) = (8 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v247, assign insn: 0x00ca: CONST  (r2v247 ? I:?[int, float, short, byte, char]) = (51 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v248, assign insn: 0x00c4: CONST  (r2v248 ? I:?[int, float, short, byte, char]) = (530(0x212, float:7.43E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v249, assign insn: 0x00be: CONST  (r2v249 ? I:?[int, float, short, byte, char]) = (24 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v250, assign insn: 0x00b8: CONST  (r2v250 ? I:?[int, float, short, byte, char]) = (10 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v251, assign insn: 0x00b2: CONST  (r2v251 ? I:?[int, float, short, byte, char]) = (32 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v252, assign insn: 0x00ac: CONST  (r2v252 ? I:?[int, float, short, byte, char]) = (16 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v253, assign insn: 0x00a6: CONST  (r2v253 ? I:?[int, float, short, byte, char]) = (40 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v254, assign insn: 0x00a0: CONST  (r2v254 ? I:?[int, float, short, byte, char]) = (36 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v255, assign insn: 0x009a: CONST  (r2v255 ? I:?[int, float, short, byte, char]) = (652(0x28c, float:9.14E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v256, assign insn: 0x0094: CONST  (r2v256 ? I:?[int, float, short, byte, char]) = (60 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v257, assign insn: 0x008e: CONST  (r2v257 ? I:?[int, float, short, byte, char]) = (96 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v258, assign insn: 0x0088: CONST  (r2v258 ? I:?[int, float, short, byte, char]) = (68 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v259, assign insn: 0x0082: CONST  (r2v259 ? I:?[int, float, short, byte, char]) = (535(0x217, float:7.5E-43) ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v260, assign insn: 0x007c: CONST  (r2v260 ? I:?[int, float, short, byte, char]) = (76 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v261, assign insn: 0x0076: CONST  (r2v261 ? I:?[int, float, short, byte, char]) = (44 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v262, assign insn: 0x0070: CONST  (r2v262 ? I:?[int, float, short, byte, char]) = (64 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v263, assign insn: 0x0066: CONST  (r2v263 ? I:?[int, float, short, byte, char]) = (74 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v264, assign insn: 0x0060: CONST  (r2v264 ? I:?[int, float, short, byte, char]) = (72 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r2v265, assign insn: 0x000d: CONST  (r2v265 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r2v266, assign insn: 0x000d: CONST  (r2v266 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    public static int m80855b(String str, awru awru) {
        sdo.m34966a((Object) str, (Object) "Country code cannot be null.");
        ? r2 = 0;
        r2 = 0;
        r2 = 0;
        if (str.equals("UK")) {
            awru.mo52515a("Did you mean to use GB? Please refer to ISO 3166-1 alpha-2.", 1037);
            return 0;
        }
        int b = bjtv.m104616b(str);
        if (!(b == 0 || b == 858)) {
            if (b == 55) {
                r2 = 533;
            } else if (b == 56) {
                r2 = 248;
            } else if (b == 65) {
                r2 = 70;
            } else if (b == 66) {
                r2 = 52;
            } else if (b == 89) {
                r2 = 112;
            } else if (b == 90) {
                r2 = 84;
            } else if (b != 99) {
                if (b != 100) {
                    switch (b) {
                        case 36:
                            r2 = 20;
                            break;
                        case FelicaException.TYPE_NOT_CLOSED:
                            r2 = 784;
                            break;
                        case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                            r2 = 4;
                            break;
                        case FelicaException.TYPE_USED_BY_OTHER_APP:
                            r2 = 28;
                            break;
                        default:
                            switch (b) {
                                case 41:
                                    r2 = 660;
                                    break;
                                case FelicaException.TYPE_OFFLINE_CANCELED:
                                    r2 = 31;
                                    break;
                                case 68:
                                    r2 = 50;
                                    break;
                                case 69:
                                    r2 = 56;
                                    break;
                                case 70:
                                    r2 = 854;
                                    break;
                                case 71:
                                    r2 = 100;
                                    break;
                                case 72:
                                    r2 = 48;
                                    break;
                                case 73:
                                    r2 = 108;
                                    break;
                                case 74:
                                    r2 = 204;
                                    break;
                                case 97:
                                    r2 = 124;
                                    break;
                                case 102:
                                    r2 = 140;
                                    break;
                                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                                    r2 = 178;
                                    break;
                                case ErrorInfo.TYPE_SDU_FAILED:
                                    r2 = 756;
                                    break;
                                case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                                    r2 = 384;
                                    break;
                                case 107:
                                    r2 = 184;
                                    break;
                                case 108:
                                    r2 = 152;
                                    break;
                                case 109:
                                    r2 = 120;
                                    break;
                                case 110:
                                    r2 = 156;
                                    break;
                                case 111:
                                    r2 = 170;
                                    break;
                                case 114:
                                    r2 = 188;
                                    break;
                                case 115:
                                case 821:
                                    r2 = 891;
                                    break;
                                case 117:
                                    r2 = 192;
                                    break;
                                case 118:
                                    r2 = 132;
                                    break;
                                case 119:
                                    r2 = 531;
                                    break;
                                case 120:
                                    r2 = 162;
                                    break;
                                case 121:
                                    r2 = 196;
                                    break;
                                case 122:
                                    r2 = 203;
                                    break;
                                case 132:
                                    r2 = 278;
                                    break;
                                case 133:
                                    r2 = 276;
                                    break;
                                case 138:
                                    r2 = 262;
                                    break;
                                case 139:
                                    r2 = 208;
                                    break;
                                case 141:
                                    r2 = 212;
                                    break;
                                case 143:
                                    r2 = 214;
                                    break;
                                case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                                    r2 = 12;
                                    break;
                                case 163:
                                    r2 = 218;
                                    break;
                                case 165:
                                    r2 = 233;
                                    break;
                                case 167:
                                    r2 = 818;
                                    break;
                                case 168:
                                    r2 = 732;
                                    break;
                                case 178:
                                    r2 = 232;
                                    break;
                                case 179:
                                    r2 = 724;
                                    break;
                                case 180:
                                    r2 = 231;
                                    break;
                                case 181:
                                case 565:
                                    r2 = 967;
                                    break;
                                case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                                    r2 = 246;
                                    break;
                                case 202:
                                    r2 = 242;
                                    break;
                                case 203:
                                    r2 = 238;
                                    break;
                                case 205:
                                    r2 = 583;
                                    break;
                                case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                                    r2 = 234;
                                    break;
                                case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
                                    r2 = 250;
                                    break;
                                case BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR:
                                    r2 = 249;
                                    break;
                                case 225:
                                    r2 = 266;
                                    break;
                                case 226:
                                    r2 = 826;
                                    break;
                                case 228:
                                    r2 = 308;
                                    break;
                                case 229:
                                    r2 = 268;
                                    break;
                                case 230:
                                    r2 = 254;
                                    break;
                                case 231:
                                    r2 = 831;
                                    break;
                                case 232:
                                    r2 = 288;
                                    break;
                                case 233:
                                    r2 = 292;
                                    break;
                                case 236:
                                    r2 = 304;
                                    break;
                                case 237:
                                    r2 = 270;
                                    break;
                                case 238:
                                    r2 = 324;
                                    break;
                                case 240:
                                    r2 = 312;
                                    break;
                                case 241:
                                    r2 = 226;
                                    break;
                                case 242:
                                    r2 = 300;
                                    break;
                                case 243:
                                    r2 = 239;
                                    break;
                                case 244:
                                    r2 = 320;
                                    break;
                                case 245:
                                    r2 = 316;
                                    break;
                                case 247:
                                    r2 = 624;
                                    break;
                                case 249:
                                    r2 = 328;
                                    break;
                                case 267:
                                    r2 = 344;
                                    break;
                                case 269:
                                    r2 = 334;
                                    break;
                                case 270:
                                    r2 = 340;
                                    break;
                                case 274:
                                    r2 = 191;
                                    break;
                                case 276:
                                    r2 = 332;
                                    break;
                                case 277:
                                    r2 = 348;
                                    break;
                                case 292:
                                    r2 = 360;
                                    break;
                                case 293:
                                    r2 = 372;
                                    break;
                                case 300:
                                    r2 = 376;
                                    break;
                                case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                                    r2 = 833;
                                    break;
                                case 302:
                                    r2 = 356;
                                    break;
                                case 303:
                                    r2 = 86;
                                    break;
                                case 305:
                                    r2 = 368;
                                    break;
                                case 306:
                                    r2 = 364;
                                    break;
                                case 307:
                                    r2 = 352;
                                    break;
                                case 308:
                                    r2 = 380;
                                    break;
                                case 325:
                                    r2 = 832;
                                    break;
                                case 333:
                                    r2 = 388;
                                    break;
                                case 335:
                                    r2 = 400;
                                    break;
                                case 336:
                                    r2 = 392;
                                    break;
                                case 357:
                                    r2 = 404;
                                    break;
                                case 359:
                                    r2 = 417;
                                    break;
                                case 360:
                                    r2 = 116;
                                    break;
                                case 361:
                                    r2 = 296;
                                    break;
                                case 365:
                                    r2 = 174;
                                    break;
                                case 366:
                                    r2 = 659;
                                    break;
                                case 368:
                                    r2 = 408;
                                    break;
                                case 370:
                                    r2 = 410;
                                    break;
                                case 375:
                                    r2 = 414;
                                    break;
                                case 377:
                                    r2 = 136;
                                    break;
                                case 378:
                                    r2 = 398;
                                    break;
                                case 385:
                                    r2 = 418;
                                    break;
                                case 386:
                                    r2 = 422;
                                    break;
                                case 387:
                                    r2 = 662;
                                    break;
                                case 393:
                                    r2 = 438;
                                    break;
                                case 395:
                                    r2 = 144;
                                    break;
                                case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                                    r2 = 430;
                                    break;
                                case 403:
                                    r2 = 426;
                                    break;
                                case 404:
                                    r2 = 440;
                                    break;
                                case 405:
                                    r2 = 442;
                                    break;
                                case 406:
                                    r2 = 428;
                                    break;
                                case 409:
                                    r2 = 434;
                                    break;
                                case 417:
                                    r2 = 504;
                                    break;
                                case 419:
                                    r2 = 492;
                                    break;
                                case 420:
                                    r2 = 498;
                                    break;
                                case 421:
                                    r2 = 499;
                                    break;
                                case 422:
                                    r2 = 663;
                                    break;
                                case 423:
                                    r2 = 450;
                                    break;
                                case 424:
                                    r2 = 584;
                                    break;
                                case 427:
                                    r2 = 807;
                                    break;
                                case 428:
                                    r2 = 466;
                                    break;
                                case 429:
                                    r2 = 104;
                                    break;
                                case 430:
                                    r2 = 496;
                                    break;
                                case 431:
                                    r2 = 446;
                                    break;
                                case 432:
                                    r2 = 580;
                                    break;
                                case 433:
                                    r2 = 474;
                                    break;
                                case 434:
                                    r2 = 478;
                                    break;
                                case 435:
                                    r2 = 500;
                                    break;
                                case 436:
                                    r2 = 470;
                                    break;
                                case 437:
                                    r2 = 480;
                                    break;
                                case 438:
                                    r2 = 462;
                                    break;
                                case 439:
                                    r2 = 454;
                                    break;
                                case 440:
                                    r2 = 484;
                                    break;
                                case 441:
                                    r2 = 458;
                                    break;
                                case 442:
                                    r2 = 508;
                                    break;
                                case 449:
                                    r2 = 516;
                                    break;
                                case 451:
                                    r2 = 540;
                                    break;
                                case 453:
                                    r2 = 562;
                                    break;
                                case 454:
                                    r2 = 574;
                                    break;
                                case 455:
                                    r2 = 566;
                                    break;
                                case 457:
                                    r2 = 558;
                                    break;
                                case 460:
                                    r2 = 528;
                                    break;
                                case 463:
                                    r2 = 578;
                                    break;
                                case 464:
                                    r2 = 524;
                                    break;
                                case 466:
                                    r2 = 520;
                                    break;
                                case 468:
                                    r2 = 536;
                                    break;
                                case 469:
                                    r2 = 570;
                                    break;
                                case 474:
                                    r2 = 554;
                                    break;
                                case 493:
                                    r2 = 512;
                                    break;
                                case 513:
                                    r2 = 591;
                                    break;
                                case 517:
                                    r2 = 604;
                                    break;
                                case 518:
                                    r2 = 258;
                                    break;
                                case 519:
                                    r2 = 598;
                                    break;
                                case 520:
                                    r2 = 608;
                                    break;
                                case 523:
                                    r2 = 586;
                                    break;
                                case 524:
                                    r2 = 616;
                                    break;
                                case 525:
                                    r2 = 666;
                                    break;
                                case 526:
                                    r2 = 612;
                                    break;
                                case 530:
                                    r2 = 630;
                                    break;
                                case 531:
                                    r2 = 275;
                                    break;
                                case 532:
                                    r2 = 620;
                                    break;
                                case 535:
                                    r2 = 585;
                                    break;
                                case 537:
                                    r2 = 600;
                                    break;
                                case 545:
                                    r2 = 634;
                                    break;
                                case 559:
                                    r2 = 961;
                                    break;
                                case 581:
                                    r2 = 638;
                                    break;
                                case 591:
                                    r2 = 642;
                                    break;
                                case 595:
                                    r2 = 688;
                                    break;
                                case 597:
                                    r2 = 643;
                                    break;
                                case 599:
                                    r2 = 646;
                                    break;
                                case 609:
                                    r2 = 682;
                                    break;
                                case 610:
                                    r2 = 90;
                                    break;
                                case 611:
                                    r2 = 690;
                                    break;
                                case 612:
                                    r2 = 729;
                                    break;
                                case 613:
                                    r2 = 752;
                                    break;
                                case 615:
                                    r2 = 702;
                                    break;
                                case 616:
                                    r2 = 654;
                                    break;
                                case 617:
                                    r2 = 705;
                                    break;
                                case 618:
                                    r2 = 744;
                                    break;
                                case 619:
                                    r2 = 703;
                                    break;
                                case 620:
                                    r2 = 694;
                                    break;
                                case 621:
                                    r2 = 674;
                                    break;
                                case 622:
                                    r2 = 686;
                                    break;
                                case 623:
                                    r2 = 706;
                                    break;
                                case 626:
                                    r2 = 740;
                                    break;
                                case 627:
                                    r2 = 728;
                                    break;
                                case 628:
                                    r2 = 678;
                                    break;
                                case 629:
                                    r2 = 810;
                                    break;
                                case 630:
                                    r2 = 222;
                                    break;
                                case 632:
                                    r2 = 534;
                                    break;
                                case 633:
                                    r2 = 760;
                                    break;
                                case 634:
                                    r2 = 748;
                                    break;
                                case 643:
                                    r2 = 796;
                                    break;
                                case 644:
                                    r2 = 148;
                                    break;
                                case 646:
                                    r2 = 260;
                                    break;
                                case 647:
                                    r2 = 768;
                                    break;
                                case 648:
                                    r2 = 764;
                                    break;
                                case 650:
                                    r2 = 762;
                                    break;
                                case 651:
                                    r2 = 772;
                                    break;
                                case 652:
                                case 656:
                                    r2 = 626;
                                    break;
                                case 653:
                                    r2 = 795;
                                    break;
                                case 654:
                                    r2 = 788;
                                    break;
                                case 655:
                                    r2 = 776;
                                    break;
                                case 658:
                                    r2 = 792;
                                    break;
                                case 660:
                                    r2 = 780;
                                    break;
                                case 662:
                                    r2 = 798;
                                    break;
                                case 663:
                                    r2 = 158;
                                    break;
                                case 666:
                                    r2 = 834;
                                    break;
                                case 673:
                                    r2 = 804;
                                    break;
                                case 679:
                                    r2 = 800;
                                    break;
                                case 685:
                                    r2 = 581;
                                    break;
                                case 691:
                                    r2 = 840;
                                    break;
                                case 697:
                                    r2 = 858;
                                    break;
                                case 698:
                                    r2 = 860;
                                    break;
                                case 705:
                                    r2 = 336;
                                    break;
                                case 707:
                                    r2 = 670;
                                    break;
                                case 709:
                                    r2 = 862;
                                    break;
                                case 711:
                                    r2 = 92;
                                    break;
                                case 713:
                                    r2 = 850;
                                    break;
                                case 718:
                                    r2 = 704;
                                    break;
                                case 725:
                                    r2 = 548;
                                    break;
                                case 742:
                                    r2 = 876;
                                    break;
                                case 755:
                                    r2 = 882;
                                    break;
                                case 769:
                                    r2 = 973;
                                    break;
                                case 770:
                                    r2 = 974;
                                    break;
                                case 771:
                                    r2 = 975;
                                    break;
                                case 779:
                                    r2 = 983;
                                    break;
                                case 804:
                                    r2 = 720;
                                    break;
                                case 805:
                                    r2 = 887;
                                    break;
                                case 820:
                                    r2 = 175;
                                    break;
                                case 833:
                                    r2 = 710;
                                    break;
                                case 845:
                                    r2 = 894;
                                    break;
                                case 850:
                                    break;
                                case 855:
                                    r2 = 716;
                                    break;
                                default:
                                    switch (b) {
                                        case FelicaException.TYPE_RESET_FAILED:
                                            r2 = 8;
                                            break;
                                        case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                            r2 = 51;
                                            break;
                                        case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                                            r2 = 530;
                                            break;
                                        case 47:
                                            r2 = 24;
                                            break;
                                        default:
                                            switch (b) {
                                                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                                                    r2 = 10;
                                                    break;
                                                case 50:
                                                    r2 = 32;
                                                    break;
                                                case 51:
                                                    r2 = 16;
                                                    break;
                                                case 52:
                                                    r2 = 40;
                                                    break;
                                                case 53:
                                                    r2 = 36;
                                                    break;
                                                default:
                                                    switch (b) {
                                                        case 76:
                                                            r2 = 652;
                                                            break;
                                                        case 77:
                                                            r2 = 60;
                                                            break;
                                                        case 78:
                                                            r2 = 96;
                                                            break;
                                                        case KeyInformation.AES128:
                                                            r2 = 68;
                                                            break;
                                                        default:
                                                            switch (b) {
                                                                case 81:
                                                                    r2 = 535;
                                                                    break;
                                                                case 82:
                                                                    r2 = 76;
                                                                    break;
                                                                case 83:
                                                                    r2 = 44;
                                                                    break;
                                                                case 84:
                                                                    r2 = 64;
                                                                    break;
                                                                case 86:
                                                                    r2 = 74;
                                                                    break;
                                                                case 87:
                                                                    r2 = 72;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
                r2 = 180;
            } else {
                r2 = 166;
            }
            if (r2 != 0) {
                return r2;
            }
        }
        awru.mo52515a("Country code invalid! Please refer to ISO 3166-1 alpha-2.", 1037);
        return r2;
    }

    /* renamed from: b */
    public static boolean m80860b(int i) {
        return i == 6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v160, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v162, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v164, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v166, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v168, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v170, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v172, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v174, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v176, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v178, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v180, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v182, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v184, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v186, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v188, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v190, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v192, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v194, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v196, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v198, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v200, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v202, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v204, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v206, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v208, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v210, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v212, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v214, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v216, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v218, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v220, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v222, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v224, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v226, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v228, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v230, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v232, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v234, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v236, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v238, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v240, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v242, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v244, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v246, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v248, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v250, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v252, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v254, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v256, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v258, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v260, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v262, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v264, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v266, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v268, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v270, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v272, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v274, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v276, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v278, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v280, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v282, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v284, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v286, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v288, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v290, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v292, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v294, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v296, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v298, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v300, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v302, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v304, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v306, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v308, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v310, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v312, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v314, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v316, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v318, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v320, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v322, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v324, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v326, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v328, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v330, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v332, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v334, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v336, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v338, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v340, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v342, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v344, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v346, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v348, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v350, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v352, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v354, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v356, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v358, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v360, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v362, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v364, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v366, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v368, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v370, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v372, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v374, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v376, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v378, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v380, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v382, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v384, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v386, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v388, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v390, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v392, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v394, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v396, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v398, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v400, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v402, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v404, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v406, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v408, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v410, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v412, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v414, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v416, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v418, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v420, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v422, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v424, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v426, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v428, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v430, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v432, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v434, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v436, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v438, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v440, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v442, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v444, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v446, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v448, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v450, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v452, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v454, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v456, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v458, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v460, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v462, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v464, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v466, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v468, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v470, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v472, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v474, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v476, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v478, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v480, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v482, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v484, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v486, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v488, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v490, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v492, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v494, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v496, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v498, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v500, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v502, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v504, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v506, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v508, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v510, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v512, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v514, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v516, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v518, resolved type: char} */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    public static int m80862c(String str) {
        char c;
        String str2 = str;
        switch (str.hashCode()) {
            case 64672:
                if (str2.equals("AED")) {
                    c = 0;
                    break;
                }
                c = -1;
                break;
            case 64713:
                if (str2.equals("AFN")) {
                    c = 1;
                    break;
                }
                c = -1;
                break;
            case 64897:
                if (str2.equals("ALL")) {
                    c = 2;
                    break;
                }
                c = -1;
                break;
            case 64920:
                if (str2.equals("AMD")) {
                    c = 3;
                    break;
                }
                c = -1;
                break;
            case 64954:
                if (str2.equals("ANG")) {
                    c = 4;
                    break;
                }
                c = -1;
                break;
            case 64979:
                if (str2.equals("AOA")) {
                    c = 5;
                    break;
                }
                c = -1;
                break;
            case 65090:
                if (str2.equals("ARS")) {
                    c = 6;
                    break;
                }
                c = -1;
                break;
            case 65168:
                if (str2.equals("AUD")) {
                    c = 7;
                    break;
                }
                c = -1;
                break;
            case 65233:
                if (str2.equals("AWG")) {
                    c = 8;
                    break;
                }
                c = -1;
                break;
            case 65333:
                if (str2.equals("AZN")) {
                    c = 9;
                    break;
                }
                c = -1;
                break;
            case 65518:
                if (str2.equals("BAM")) {
                    c = 10;
                    break;
                }
                c = -1;
                break;
            case 65540:
                if (str2.equals("BBD")) {
                    c = 11;
                    break;
                }
                c = -1;
                break;
            case 65618:
                if (str2.equals("BDT")) {
                    c = 12;
                    break;
                }
                c = -1;
                break;
            case 65705:
                if (str2.equals("BGN")) {
                    c = 13;
                    break;
                }
                c = -1;
                break;
            case 65726:
                if (str2.equals("BHD")) {
                    c = 14;
                    break;
                }
                c = -1;
                break;
            case 65759:
                if (str2.equals("BIF")) {
                    c = 15;
                    break;
                }
                c = -1;
                break;
            case 65881:
                if (str2.equals("BMD")) {
                    c = 16;
                    break;
                }
                c = -1;
                break;
            case 65912:
                if (str2.equals("BND")) {
                    c = 17;
                    break;
                }
                c = -1;
                break;
            case 65941:
                if (str2.equals("BOB")) {
                    c = 18;
                    break;
                }
                c = -1;
                break;
            case 65961:
                if (str2.equals("BOV")) {
                    c = 19;
                    break;
                }
                c = -1;
                break;
            case 66044:
                if (str2.equals("BRL")) {
                    c = 20;
                    break;
                }
                c = -1;
                break;
            case 66067:
                if (str2.equals("BSD")) {
                    c = 21;
                    break;
                }
                c = -1;
                break;
            case 66108:
                if (str2.equals("BTN")) {
                    c = 22;
                    break;
                }
                c = -1;
                break;
            case 66203:
                if (str2.equals("BWP")) {
                    c = 23;
                    break;
                }
                c = -1;
                break;
            case 66263:
                if (str2.equals("BYN")) {
                    c = 24;
                    break;
                }
                c = -1;
                break;
            case 66267:
                if (str2.equals("BYR")) {
                    c = 25;
                    break;
                }
                c = -1;
                break;
            case 66284:
                if (str2.equals("BZD")) {
                    c = 26;
                    break;
                }
                c = -1;
                break;
            case 66470:
                if (str2.equals("CAD")) {
                    c = 27;
                    break;
                }
                c = -1;
                break;
            case 66565:
                if (str2.equals("CDF")) {
                    c = 28;
                    break;
                }
                c = -1;
                break;
            case 66688:
                if (str2.equals("CHE")) {
                    c = 29;
                    break;
                }
                c = -1;
                break;
            case 66689:
                if (str2.equals("CHF")) {
                    c = 30;
                    break;
                }
                c = -1;
                break;
            case 66706:
                if (str2.equals("CHW")) {
                    c = 31;
                    break;
                }
                c = -1;
                break;
            case 66813:
                if (str2.equals("CLF")) {
                    c = 32;
                    break;
                }
                c = -1;
                break;
            case 66823:
                if (str2.equals("CLP")) {
                    c = 33;
                    break;
                }
                c = -1;
                break;
            case 66894:
                if (str2.equals("CNY")) {
                    c = 34;
                    break;
                }
                c = -1;
                break;
            case 66916:
                if (str2.equals("COP")) {
                    c = 35;
                    break;
                }
                c = -1;
                break;
            case 66921:
                if (str2.equals("COU")) {
                    c = 36;
                    break;
                }
                c = -1;
                break;
            case 66996:
                if (str2.equals("CRC")) {
                    c = 37;
                    break;
                }
                c = -1;
                break;
            case 67089:
                if (str2.equals("CUC")) {
                    c = 38;
                    break;
                }
                c = -1;
                break;
            case 67102:
                if (str2.equals("CUP")) {
                    c = 39;
                    break;
                }
                c = -1;
                break;
            case 67122:
                if (str2.equals("CVE")) {
                    c = 40;
                    break;
                }
                c = -1;
                break;
            case 67252:
                if (str2.equals("CZK")) {
                    c = 41;
                    break;
                }
                c = -1;
                break;
            case 67712:
                if (str2.equals("DJF")) {
                    c = 42;
                    break;
                }
                c = -1;
                break;
            case 67748:
                if (str2.equals("DKK")) {
                    c = 43;
                    break;
                }
                c = -1;
                break;
            case 67877:
                if (str2.equals("DOP")) {
                    c = 44;
                    break;
                }
                c = -1;
                break;
            case 68206:
                if (str2.equals("DZD")) {
                    c = 45;
                    break;
                }
                c = -1;
                break;
            case 68590:
                if (str2.equals("EGP")) {
                    c = 46;
                    break;
                }
                c = -1;
                break;
            case 68929:
                if (str2.equals("ERN")) {
                    c = 47;
                    break;
                }
                c = -1;
                break;
            case 68979:
                if (str2.equals("ETB")) {
                    c = 48;
                    break;
                }
                c = -1;
                break;
            case 69026:
                if (str2.equals("EUR")) {
                    c = 49;
                    break;
                }
                c = -1;
                break;
            case 69632:
                if (str2.equals("FJD")) {
                    c = 50;
                    break;
                }
                c = -1;
                break;
            case 69675:
                if (str2.equals("FKP")) {
                    c = 51;
                    break;
                }
                c = -1;
                break;
            case 70357:
                if (str2.equals("GBP")) {
                    c = 52;
                    break;
                }
                c = -1;
                break;
            case 70446:
                if (str2.equals("GEL")) {
                    c = 53;
                    break;
                }
                c = -1;
                break;
            case 70546:
                if (str2.equals("GHS")) {
                    c = 54;
                    break;
                }
                c = -1;
                break;
            case 70574:
                if (str2.equals("GIP")) {
                    c = 55;
                    break;
                }
                c = -1;
                break;
            case 70686:
                if (str2.equals("GMD")) {
                    c = 56;
                    break;
                }
                c = -1;
                break;
            case 70719:
                if (str2.equals("GNF")) {
                    c = 57;
                    break;
                }
                c = -1;
                break;
            case 70916:
                if (str2.equals("GTQ")) {
                    c = 58;
                    break;
                }
                c = -1;
                break;
            case 71058:
                if (str2.equals("GYD")) {
                    c = 59;
                    break;
                }
                c = -1;
                break;
            case 71585:
                if (str2.equals("HKD")) {
                    c = 60;
                    break;
                }
                c = -1;
                break;
            case 71686:
                if (str2.equals("HNL")) {
                    c = 61;
                    break;
                }
                c = -1;
                break;
            case 71809:
                if (str2.equals("HRK")) {
                    c = 62;
                    break;
                }
                c = -1;
                break;
            case 71867:
                if (str2.equals("HTG")) {
                    c = 63;
                    break;
                }
                c = -1;
                break;
            case 71897:
                if (str2.equals("HUF")) {
                    c = 64;
                    break;
                }
                c = -1;
                break;
            case 72343:
                if (str2.equals("IDR")) {
                    c = 65;
                    break;
                }
                c = -1;
                break;
            case 72592:
                if (str2.equals("ILS")) {
                    c = 66;
                    break;
                }
                c = -1;
                break;
            case 72653:
                if (str2.equals("INR")) {
                    c = 67;
                    break;
                }
                c = -1;
                break;
            case 72732:
                if (str2.equals("IQD")) {
                    c = 68;
                    break;
                }
                c = -1;
                break;
            case 72777:
                if (str2.equals("IRR")) {
                    c = 69;
                    break;
                }
                c = -1;
                break;
            case 72801:
                if (str2.equals("ISK")) {
                    c = 70;
                    break;
                }
                c = -1;
                break;
            case 73569:
                if (str2.equals("JMD")) {
                    c = 71;
                    break;
                }
                c = -1;
                break;
            case 73631:
                if (str2.equals("JOD")) {
                    c = 72;
                    break;
                }
                c = -1;
                break;
            case 73683:
                if (str2.equals("JPY")) {
                    c = 73;
                    break;
                }
                c = -1;
                break;
            case 74297:
                if (str2.equals("KES")) {
                    c = 74;
                    break;
                }
                c = -1;
                break;
            case 74359:
                if (str2.equals("KGS")) {
                    c = 75;
                    break;
                }
                c = -1;
                break;
            case 74389:
                if (str2.equals("KHR")) {
                    c = 76;
                    break;
                }
                c = -1;
                break;
            case 74532:
                if (str2.equals("KMF")) {
                    c = 77;
                    break;
                }
                c = -1;
                break;
            case 74642:
                if (str2.equals("KPW")) {
                    c = 78;
                    break;
                }
                c = -1;
                break;
            case 74704:
                if (str2.equals("KRW")) {
                    c = 79;
                    break;
                }
                c = -1;
                break;
            case 74840:
                if (str2.equals("KWD")) {
                    c = 80;
                    break;
                }
                c = -1;
                break;
            case 74902:
                if (str2.equals("KYD")) {
                    c = 81;
                    break;
                }
                c = -1;
                break;
            case 74949:
                if (str2.equals("KZT")) {
                    c = 82;
                    break;
                }
                c = -1;
                break;
            case 75126:
                if (str2.equals("LAK")) {
                    c = 83;
                    break;
                }
                c = -1;
                break;
            case 75162:
                if (str2.equals("LBP")) {
                    c = 84;
                    break;
                }
                c = -1;
                break;
            case 75443:
                if (str2.equals("LKR")) {
                    c = 85;
                    break;
                }
                c = -1;
                break;
            case 75646:
                if (str2.equals("LRD")) {
                    c = 86;
                    break;
                }
                c = -1;
                break;
            case 75685:
                if (str2.equals("LSL")) {
                    c = 87;
                    break;
                }
                c = -1;
                break;
            case 75863:
                if (str2.equals("LYD")) {
                    c = 88;
                    break;
                }
                c = -1;
                break;
            case 76080:
                if (str2.equals("MAD")) {
                    c = 89;
                    break;
                }
                c = -1;
                break;
            case 76181:
                if (str2.equals("MDL")) {
                    c = 90;
                    break;
                }
                c = -1;
                break;
            case 76263:
                if (str2.equals("MGA")) {
                    c = 91;
                    break;
                }
                c = -1;
                break;
            case 76390:
                if (str2.equals("MKD")) {
                    c = 92;
                    break;
                }
                c = -1;
                break;
            case 76459:
                if (str2.equals("MMK")) {
                    c = 93;
                    break;
                }
                c = -1;
                break;
            case 76499:
                if (str2.equals("MNT")) {
                    c = 94;
                    break;
                }
                c = -1;
                break;
            case 76526:
                if (str2.equals("MOP")) {
                    c = 95;
                    break;
                }
                c = -1;
                break;
            case 76618:
                if (str2.equals("MRO")) {
                    c = 96;
                    break;
                }
                c = -1;
                break;
            case 76714:
                if (str2.equals("MUR")) {
                    c = 97;
                    break;
                }
                c = -1;
                break;
            case 76745:
                if (str2.equals("MVR")) {
                    c = 98;
                    break;
                }
                c = -1;
                break;
            case 76769:
                if (str2.equals("MWK")) {
                    c = 99;
                    break;
                }
                c = -1;
                break;
            case 76803:
                if (str2.equals("MXN")) {
                    c = 100;
                    break;
                }
                c = -1;
                break;
            case 76811:
                if (str2.equals("MXV")) {
                    c = 101;
                    break;
                }
                c = -1;
                break;
            case 76838:
                if (str2.equals("MYR")) {
                    c = 102;
                    break;
                }
                c = -1;
                break;
            case 76865:
                if (str2.equals("MZN")) {
                    c = 103;
                    break;
                }
                c = -1;
                break;
            case 77041:
                if (str2.equals("NAD")) {
                    c = 104;
                    break;
                }
                c = -1;
                break;
            case 77237:
                if (str2.equals("NGN")) {
                    c = 105;
                    break;
                }
                c = -1;
                break;
            case 77300:
                if (str2.equals("NIO")) {
                    c = 106;
                    break;
                }
                c = -1;
                break;
            case 77482:
                if (str2.equals("NOK")) {
                    c = 107;
                    break;
                }
                c = -1;
                break;
            case 77520:
                if (str2.equals("NPR")) {
                    c = 108;
                    break;
                }
                c = -1;
                break;
            case 77816:
                if (str2.equals("NZD")) {
                    c = 109;
                    break;
                }
                c = -1;
                break;
            case 78388:
                if (str2.equals("OMR")) {
                    c = 110;
                    break;
                }
                c = -1;
                break;
            case 78961:
                if (str2.equals("PAB")) {
                    c = 111;
                    break;
                }
                c = -1;
                break;
            case 79097:
                if (str2.equals("PEN")) {
                    c = 112;
                    break;
                }
                c = -1;
                break;
            case 79156:
                if (str2.equals("PGK")) {
                    c = 113;
                    break;
                }
                c = -1;
                break;
            case 79192:
                if (str2.equals("PHP")) {
                    c = 114;
                    break;
                }
                c = -1;
                break;
            case 79287:
                if (str2.equals("PKR")) {
                    c = 115;
                    break;
                }
                c = -1;
                break;
            case 79314:
                if (str2.equals("PLN")) {
                    c = 116;
                    break;
                }
                c = -1;
                break;
            case 79710:
                if (str2.equals("PYG")) {
                    c = 117;
                    break;
                }
                c = -1;
                break;
            case 79938:
                if (str2.equals("QAR")) {
                    c = 118;
                    break;
                }
                c = -1;
                break;
            case 81329:
                if (str2.equals("RON")) {
                    c = 119;
                    break;
                }
                c = -1;
                break;
            case 81443:
                if (str2.equals("RSD")) {
                    c = 120;
                    break;
                }
                c = -1;
                break;
            case 81503:
                if (str2.equals("RUB")) {
                    c = 121;
                    break;
                }
                c = -1;
                break;
            case 81569:
                if (str2.equals("RWF")) {
                    c = 122;
                    break;
                }
                c = -1;
                break;
            case 81860:
                if (str2.equals("SAR")) {
                    c = 123;
                    break;
                }
                c = -1;
                break;
            case 81877:
                if (str2.equals("SBD")) {
                    c = 124;
                    break;
                }
                c = -1;
                break;
            case 81922:
                if (str2.equals("SCR")) {
                    c = 125;
                    break;
                }
                c = -1;
                break;
            case 81942:
                if (str2.equals("SDG")) {
                    c = 126;
                    break;
                }
                c = -1;
                break;
            case 81977:
                if (str2.equals("SEK")) {
                    c = 127;
                    break;
                }
                c = -1;
                break;
            case 82032:
                if (str2.equals("SGD")) {
                    c = 128;
                    break;
                }
                c = -1;
                break;
            case 82075:
                if (str2.equals("SHP")) {
                    c = 129;
                    break;
                }
                c = -1;
                break;
            case 82195:
                if (str2.equals("SLL")) {
                    c = 130;
                    break;
                }
                c = -1;
                break;
            case 82295:
                if (str2.equals("SOS")) {
                    c = 131;
                    break;
                }
                c = -1;
                break;
            case 82373:
                if (str2.equals("SRD")) {
                    c = 132;
                    break;
                }
                c = -1;
                break;
            case 82416:
                if (str2.equals("SSP")) {
                    c = 133;
                    break;
                }
                c = -1;
                break;
            case 82435:
                if (str2.equals("STD")) {
                    c = 134;
                    break;
                }
                c = -1;
                break;
            case 82496:
                if (str2.equals("SVC")) {
                    c = 135;
                    break;
                }
                c = -1;
                break;
            case 82602:
                if (str2.equals("SYP")) {
                    c = 136;
                    break;
                }
                c = -1;
                break;
            case 82629:
                if (str2.equals("SZL")) {
                    c = 137;
                    break;
                }
                c = -1;
                break;
            case 83022:
                if (str2.equals("THB")) {
                    c = 138;
                    break;
                }
                c = -1;
                break;
            case 83101:
                if (str2.equals("TJS")) {
                    c = 139;
                    break;
                }
                c = -1;
                break;
            case 83195:
                if (str2.equals("TMT")) {
                    c = 140;
                    break;
                }
                c = -1;
                break;
            case 83210:
                if (str2.equals("TND")) {
                    c = 141;
                    break;
                }
                c = -1;
                break;
            case 83253:
                if (str2.equals("TOP")) {
                    c = 142;
                    break;
                }
                c = -1;
                break;
            case 83355:
                if (str2.equals("TRY")) {
                    c = 143;
                    break;
                }
                c = -1;
                break;
            case 83396:
                if (str2.equals("TTD")) {
                    c = 144;
                    break;
                }
                c = -1;
                break;
            case 83489:
                if (str2.equals("TWD")) {
                    c = 145;
                    break;
                }
                c = -1;
                break;
            case 83597:
                if (str2.equals("TZS")) {
                    c = 146;
                    break;
                }
                c = -1;
                break;
            case 83772:
                if (str2.equals("UAH")) {
                    c = 147;
                    break;
                }
                c = -1;
                break;
            case 83974:
                if (str2.equals("UGX")) {
                    c = 148;
                    break;
                }
                c = -1;
                break;
            case 84326:
                if (str2.equals("USD")) {
                    c = 149;
                    break;
                }
                c = -1;
                break;
            case 84336:
                if (str2.equals("USN")) {
                    c = 150;
                    break;
                }
                c = -1;
                break;
            case 84517:
                if (str2.equals("UYI")) {
                    c = 151;
                    break;
                }
                c = -1;
                break;
            case 84529:
                if (str2.equals("UYU")) {
                    c = 152;
                    break;
                }
                c = -1;
                break;
            case 84558:
                if (str2.equals("UZS")) {
                    c = 153;
                    break;
                }
                c = -1;
                break;
            case 84855:
                if (str2.equals("VEF")) {
                    c = 154;
                    break;
                }
                c = -1;
                break;
            case 85132:
                if (str2.equals("VND")) {
                    c = 155;
                    break;
                }
                c = -1;
                break;
            case 85367:
                if (str2.equals("VUV")) {
                    c = 156;
                    break;
                }
                c = -1;
                break;
            case 86264:
                if (str2.equals("WST")) {
                    c = 157;
                    break;
                }
                c = -1;
                break;
            case 86653:
                if (str2.equals("XAF")) {
                    c = 158;
                    break;
                }
                c = -1;
                break;
            case 86654:
                if (str2.equals("XAG")) {
                    c = 159;
                    break;
                }
                c = -1;
                break;
            case 86668:
                if (str2.equals("XAU")) {
                    c = 160;
                    break;
                }
                c = -1;
                break;
            case 86679:
                if (str2.equals("XBA")) {
                    c = 161;
                    break;
                }
                c = -1;
                break;
            case 86680:
                if (str2.equals("XBB")) {
                    c = 162;
                    break;
                }
                c = -1;
                break;
            case 86681:
                if (str2.equals("XBC")) {
                    c = 163;
                    break;
                }
                c = -1;
                break;
            case 86682:
                if (str2.equals("XBD")) {
                    c = 164;
                    break;
                }
                c = -1;
                break;
            case 86713:
                if (str2.equals("XCD")) {
                    c = 165;
                    break;
                }
                c = -1;
                break;
            case 86758:
                if (str2.equals("XDR")) {
                    c = 166;
                    break;
                }
                c = -1;
                break;
            case 87087:
                if (str2.equals("XOF")) {
                    c = 167;
                    break;
                }
                c = -1;
                break;
            case 87116:
                if (str2.equals("XPD")) {
                    c = 168;
                    break;
                }
                c = -1;
                break;
            case 87118:
                if (str2.equals("XPF")) {
                    c = 169;
                    break;
                }
                c = -1;
                break;
            case 87132:
                if (str2.equals("XPT")) {
                    c = 170;
                    break;
                }
                c = -1;
                break;
            case 87226:
                if (str2.equals("XSU")) {
                    c = 171;
                    break;
                }
                c = -1;
                break;
            case 87255:
                if (str2.equals("XTS")) {
                    c = 172;
                    break;
                }
                c = -1;
                break;
            case 87268:
                if (str2.equals("XUA")) {
                    c = 173;
                    break;
                }
                c = -1;
                break;
            case 87384:
                if (str2.equals("XXX")) {
                    c = 178;
                    break;
                }
                c = -1;
                break;
            case 87750:
                if (str2.equals("YER")) {
                    c = 174;
                    break;
                }
                c = -1;
                break;
            case 88587:
                if (str2.equals("ZAR")) {
                    c = 175;
                    break;
                }
                c = -1;
                break;
            case 88964:
                if (str2.equals("ZMW")) {
                    c = 176;
                    break;
                }
                c = -1;
                break;
            case 89263:
                if (str2.equals("ZWL")) {
                    c = 177;
                    break;
                }
                c = -1;
                break;
            default:
                c = -1;
                break;
        }
        switch (c) {
            case 0:
                return 784;
            case 1:
                return 971;
            case 2:
                return 8;
            case 3:
                return 51;
            case 4:
                return 532;
            case 5:
                return 973;
            case 6:
                return 32;
            case 7:
                return 36;
            case 8:
                return 533;
            case 9:
                return 944;
            case 10:
                return 977;
            case 11:
                return 52;
            case 12:
                return 50;
            case 13:
                return 975;
            case 14:
                return 48;
            case 15:
                return 108;
            case 16:
                return 60;
            case 17:
                return 96;
            case 18:
                return 68;
            case 19:
                return 984;
            case 20:
                return 986;
            case 21:
                return 44;
            case 22:
                return 64;
            case 23:
                return 72;
            case 24:
                return 933;
            case 25:
                return 974;
            case 26:
                return 84;
            case 27:
                return 124;
            case 28:
                return 976;
            case 29:
                return 947;
            case 30:
                return 756;
            case 31:
                return 948;
            case ' ':
                return 990;
            case '!':
                return MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED;
            case '\"':
                return MfiClientException.TYPE_NO_ACCOUNT_INFO;
            case '#':
                return 170;
            case '$':
                return 970;
            case FelicaException.TYPE_NOT_CLOSED:
                return 188;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return 931;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
            case FelicaException.TYPE_PUSH_FAILED:
                return 132;
            case ')':
                return 203;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return 262;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return 208;
            case FelicaException.TYPE_RESET_FAILED:
                return BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return 12;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return 818;
            case '/':
                return 232;
            case '0':
                return 230;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return 978;
            case '2':
                return 242;
            case '3':
                return 238;
            case '4':
                return 826;
            case '5':
                return 981;
            case '6':
                return 936;
            case '7':
                return 292;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return 270;
            case '9':
                return 324;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return 320;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return 328;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return 344;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return 340;
            case '>':
                return 191;
            case '?':
                return 332;
            case '@':
                return 348;
            case KeyInformation.AES128_DES56:
                return 360;
            case 'B':
                return 376;
            case KeyInformation.AES128_DES112:
                return 356;
            case 'D':
                return 368;
            case 'E':
                return 364;
            case 'F':
                return 352;
            case 'G':
                return 388;
            case 'H':
                return 400;
            case 'I':
                return 392;
            case 'J':
                return 404;
            case 'K':
                return 417;
            case 'L':
                return 116;
            case 'M':
                return 174;
            case 'N':
                return 408;
            case KeyInformation.AES128:
                return 410;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return 414;
            case 'Q':
                return 136;
            case 'R':
                return 398;
            case 'S':
                return 418;
            case 'T':
                return 422;
            case 'U':
                return AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD;
            case 'V':
                return 430;
            case 'W':
                return 426;
            case 'X':
                return 434;
            case 'Y':
                return 504;
            case 'Z':
                return 498;
            case '[':
                return 969;
            case '\\':
                return 807;
            case ']':
                return ErrorInfo.TYPE_SDU_FAILED;
            case '^':
                return 496;
            case '_':
                return 446;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /*96*/:
                return 478;
            case 'a':
                return 480;
            case 'b':
                return 462;
            case 'c':
                return 454;
            case 'd':
                return 484;
            case 'e':
                return 979;
            case 'f':
                return 458;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return 943;
            case ErrorInfo.TYPE_SDU_FAILED:
                return 516;
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                return 566;
            case 'j':
                return 558;
            case 'k':
                return 578;
            case 'l':
                return 524;
            case 'm':
                return 554;
            case 'n':
                return 512;
            case 'o':
                return 590;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                return 604;
            case 'q':
                return 598;
            case 'r':
                return 608;
            case 's':
                return 586;
            case 't':
                return 985;
            case 'u':
                return 600;
            case 'v':
                return 634;
            case 'w':
                return 946;
            case 'x':
                return 941;
            case 'y':
                return 643;
            case 'z':
                return 646;
            case '{':
                return 682;
            case '|':
                return 90;
            case '}':
                return 690;
            case '~':
                return 938;
            case 127:
                return 752;
            case 128:
                return 702;
            case 129:
                return 654;
            case 130:
                return 694;
            case 131:
                return 706;
            case 132:
                return 968;
            case 133:
                return 728;
            case 134:
                return 678;
            case 135:
                return 222;
            case 136:
                return 760;
            case 137:
                return 748;
            case 138:
                return 764;
            case 139:
                return 972;
            case 140:
                return 934;
            case 141:
                return 788;
            case 142:
                return 776;
            case 143:
                return 949;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD /*144*/:
                return 780;
            case 145:
                return 901;
            case 146:
                return 834;
            case 147:
                return 980;
            case 148:
                return 800;
            case 149:
                return 840;
            case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                return 997;
            case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                return 940;
            case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                return 858;
            case MfiClientException.TYPE_MFICLIENT_STARTED:
                return 860;
            case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                return 937;
            case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                return 704;
            case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                return 548;
            case MfiClientException.TYPE_CARD_NOT_CACHED:
                return 882;
            case MfiClientException.TYPE_ILLEGAL_CARD_OPERATION:
                return 950;
            case MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE:
                return 961;
            case 160:
                return 959;
            case 161:
                return 955;
            case 162:
                return 956;
            case 163:
                return 957;
            case 164:
                return 958;
            case 165:
                return 951;
            case 166:
                return 960;
            case 167:
                return 952;
            case 168:
                return 964;
            case 169:
                return 953;
            case 170:
                return 962;
            case 171:
                return 994;
            case 172:
                return 963;
            case 173:
                return 965;
            case 174:
                return 886;
            case 175:
                return 710;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER /*176*/:
                return 967;
            case 177:
                return 932;
            case 178:
                return 999;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    static String m80864c(int i) {
        switch (i) {
            case 1:
                return "AMEX";
            case 2:
                return "DISCOVER";
            case 3:
                return "JCB";
            case 4:
                return "MASTERCARD";
            case 5:
                return "VISA";
            case 6:
                return "INTERAC";
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static int m80867d(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 8;
        }
        if (i2 == 2) {
            return 10;
        }
        if (i2 == 3) {
            return 409;
        }
        if (i2 != 4) {
            return i2 != 5 ? 413 : 412;
        }
        return 405;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static int m80871e(String str) {
        char c;
        switch (str.hashCode()) {
            case -1618922018:
                if (str.equals("INTERAC")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1553624974:
                if (str.equals("MASTERCARD")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 73257:
                if (str.equals("JCB")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2012639:
                if (str.equals("AMEX")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2634817:
                if (str.equals("VISA")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1055811561:
                if (str.equals("DISCOVER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 6;
        }
        if (c == 3) {
            return 3;
        }
        if (c != 4) {
            return c != 5 ? 1000 : 5;
        }
        return 4;
    }

    /* renamed from: f */
    public static List m80873f(JSONObject jSONObject, awru awru) {
        int optInt = jSONObject.optInt("apiVersion", 0);
        if (optInt == 0) {
            return m80859b(jSONObject.optJSONArray("allowedCardNetworks"));
        }
        if (optInt == 1) {
            JSONObject optJSONObject = jSONObject.optJSONObject("cardRequirements");
            if (optJSONObject == null) {
                return Collections.EMPTY_LIST;
            }
            return m80859b(optJSONObject.optJSONArray("allowedCardNetworks"));
        } else if (optInt != 2) {
            return Collections.EMPTY_LIST;
        } else {
            JSONObject a = m80842a((JSONArray) m80830a(jSONObject, "allowedPaymentMethods", (String) null, JSONArray.class, 1080, awru), awru);
            if (!awru.f94946a.isEmpty() || a == null) {
                return Collections.EMPTY_LIST;
            }
            JSONArray jSONArray = (JSONArray) m80830a(a, "allowedCardNetworks", String.format("allowedPaymentMethod CARD's parameters", new Object[0]), JSONArray.class, 1081, awru);
            if (jSONArray == null || jSONArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String str = (String) m80828a(jSONArray, i, "allowedCardNetworks", String.class, 1081, awru);
                if (str == null) {
                    return Collections.EMPTY_LIST;
                }
                arrayList.add(Integer.valueOf(m80871e(str)));
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
    /* renamed from: g */
    public static List m80874g(JSONObject jSONObject, awru awru) {
        char c;
        int i;
        ArrayList arrayList = new ArrayList();
        int optInt = jSONObject.optInt("apiVersion", 0);
        if (optInt == 1) {
            JSONArray optJSONArray = jSONObject.optJSONArray("allowedPaymentMethods");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString = optJSONArray.optString(i2);
                int hashCode = optString.hashCode();
                if (hashCode != 2061072) {
                    if (hashCode == 275013286 && optString.equals("TOKENIZED_CARD")) {
                        c = 1;
                        if (c != 0) {
                            i = c != 1 ? 0 : 2;
                        } else {
                            i = 1;
                        }
                        arrayList.add(Integer.valueOf(i));
                    }
                } else if (optString.equals("CARD")) {
                    c = 0;
                    if (c != 0) {
                    }
                    arrayList.add(Integer.valueOf(i));
                }
                c = 65535;
                if (c != 0) {
                }
                arrayList.add(Integer.valueOf(i));
            }
        } else if (optInt == 2) {
            JSONObject a = m80842a((JSONArray) m80830a(jSONObject, "allowedPaymentMethods", (String) null, JSONArray.class, 1080, awru), awru);
            if (!awru.f94946a.isEmpty() || a == null) {
                return Collections.EMPTY_LIST;
            }
            JSONArray jSONArray = (JSONArray) m80830a(a, "allowedAuthMethods", String.format("allowedPaymentMethod CARD's parameters", new Object[0]), JSONArray.class, 1077, awru);
            if (!awru.f94946a.isEmpty() || jSONArray == null) {
                return Collections.EMPTY_LIST;
            }
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String str = (String) m80828a(jSONArray, i3, "allowedAuthMethods", String.class, 1077, awru);
                if ("PAN_ONLY".equals(str)) {
                    arrayList.add(1);
                } else if ("CRYPTOGRAM_3DS".equals(str)) {
                    arrayList.add(2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static List m80875h(JSONObject jSONObject, awru awru) {
        if (jSONObject.optInt("apiVersion", 0) != 2) {
            return Collections.EMPTY_LIST;
        }
        JSONArray jSONArray = (JSONArray) m80830a(jSONObject, "allowedPaymentMethods", (String) null, JSONArray.class, 1080, awru);
        if (jSONArray == null || jSONArray.length() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String str = (String) m80830a((JSONObject) m80828a(jSONArray, i, "allowedPaymentMethods", JSONObject.class, 1080, awru), "type", String.format("allowedPaymentMethods[%s]", Integer.valueOf(i)), String.class, 1079, awru);
            if (f94943c.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (r8.equals("SHIPPING_ADDRESS") != false) goto L_0x0088;
     */
    /* renamed from: i */
    private static bwee m80876i(JSONObject jSONObject, awru awru) {
        JSONObject jSONObject2 = (JSONObject) m80829a(jSONObject, "error", JSONObject.class, 1101, awru);
        if (jSONObject2 != null) {
            String str = (String) m80830a(jSONObject2, "message", "error", String.class, 1101, awru);
            String str2 = (String) m80830a(jSONObject2, "intent", "error", String.class, 1101, awru);
            if (str != null && !TextUtils.isEmpty(str2)) {
                bxvd da = bwee.f158964d.mo74144da();
                char c = 0;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwee bwee = (bwee) da.f164949b;
                str.getClass();
                int i = 1;
                int i2 = bwee.f158966a | 1;
                bwee.f158966a = i2;
                bwee.f158967b = str;
                switch (str2.hashCode()) {
                    case -1934606912:
                        if (str2.equals("PAYMENT_AUTHORIZATION")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -579816102:
                        if (str2.equals("PAYMENT_METHOD")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 909774403:
                        break;
                    case 1827179558:
                        if (str2.equals("SHIPPING_OPTION")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    i = 2;
                } else if (c == 1) {
                    i = 3;
                } else if (c == 2) {
                    i = 4;
                } else if (c == 3) {
                    i = 6;
                }
                bwee.f158968c = i - 1;
                bwee.f158966a = i2 | 2;
                return (bwee) da.mo74062i();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m80804a(IbBuyFlowInput ibBuyFlowInput, String str) {
        return ibBuyFlowInput.mo59974a(str) != 7 ? 2 : 3;
    }

    /* renamed from: c */
    public static int m80863c(JSONObject jSONObject, awru awru) {
        Integer num = (Integer) m80829a(jSONObject, "apiVersion", Integer.class, 1055, awru);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public static bwef m80868d(String str) {
        bwdy bwdy = (bwdy) bwef.f158969g.mo74144da();
        bxvd da = bwee.f158964d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwee bwee = (bwee) da.f164949b;
        bwee.f158968c = 0;
        int i = bwee.f158966a | 2;
        bwee.f158966a = i;
        str.getClass();
        bwee.f158966a = i | 1;
        bwee.f158967b = str;
        if (bwdy.f164950c) {
            bwdy.mo74035c();
            bwdy.f164950c = false;
        }
        bwef bwef = (bwef) bwdy.f164949b;
        bwee bwee2 = (bwee) da.mo74062i();
        bwee2.getClass();
        bwef.f158975e = bwee2;
        bwef.f158971a |= 2;
        return (bwef) bwdy.mo74062i();
    }

    /* renamed from: e */
    public static int m80872e(JSONObject jSONObject, awru awru) {
        Object opt = jSONObject.opt("apiVersionMinor");
        if (opt != null) {
            if (opt instanceof Integer) {
                return ((Integer) opt).intValue();
            }
            awru.mo52515a(String.format(Locale.US, "%s must be a JSON integer!", "apiVersionMinor"), 1072);
        }
        if (jSONObject.optInt("apiVersion", 0) >= 2) {
            awru.mo52515a(String.format(Locale.US, "%s must be set!", "apiVersionMinor"), 1073);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static int m80805a(JSONObject jSONObject) {
        char c;
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("paymentMethodTokenizationParameters");
        String str = null;
        if (!(optJSONObject2 == null || !"GATEWAY_TOKEN".equals(optJSONObject2.optString("tokenizationType")) || (optJSONObject = optJSONObject2.optJSONObject("parameters")) == null)) {
            str = optJSONObject.optString("gateway");
        }
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -995205389) {
            if (hashCode == -466175865 && str.equals("visacheckout")) {
                c = 1;
                if (c != 0) {
                    return c != 1 ? 1 : 3;
                }
                return 2;
            }
        } else if (str.equals("paypal")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: b */
    public static int m80856b(JSONObject jSONObject, awru awru) {
        Object opt = jSONObject.opt("minGooglePlayServicesVersion");
        if (opt != null) {
            if (opt instanceof String) {
                try {
                    return Integer.parseInt((String) opt);
                } catch (NumberFormatException e) {
                }
            }
            awru.mo52515a(String.format(Locale.US, "%s must be a JSON string containing an integer!", "minGooglePlayServicesVersion"), 1052);
        }
        return 0;
    }

    /* renamed from: c */
    static String m80865c(int i, awru awru) {
        if (i == 0) {
            return "MIN";
        }
        if (i == 1) {
            return "FULL";
        }
        awru.mo52515a(String.format(Locale.US, "Billing address was requested but found invalid BillingAddressFormat: %d", Integer.valueOf(i)), 1058);
        return "";
    }

    /* renamed from: a */
    static long m80806a(String str, String str2, awru awru) {
        if (TextUtils.isEmpty(str)) {
            awru.mo52515a(String.format(Locale.US, "Field %s is required", str2), 1028);
            return 0;
        } else if (!f94944d.matcher(str).matches()) {
            awru.mo52515a(String.format(Locale.US, "%s is invalid. The input was \"%s\", but should be a string in the regex format \"%s\"", str2, str, f94944d.pattern()), 1029);
            return 0;
        } else {
            try {
                return new BigDecimal(str).multiply(new BigDecimal(1000000)).setScale(0, RoundingMode.UP).longValueExact();
            } catch (ArithmeticException | NumberFormatException e) {
                awru.mo52515a(String.format(Locale.US, "Could not parse %s with value = \"%s\": %s", str2, str, e.getMessage()), 1025);
                return 0;
            }
        }
    }

    /* renamed from: b */
    public static bwev m80857b(String str) {
        JSONObject optJSONObject;
        JSONObject a = m80840a(str, new awru());
        if (a == null || (optJSONObject = a.optJSONObject("paymentMethodTokenizationParameters")) == null) {
            return null;
        }
        bxvd da = bwev.f159029d.mo74144da();
        String optString = optJSONObject.optString("tokenizationType");
        if ("GATEWAY_TOKEN".equals(optString)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwev bwev = (bwev) da.f164949b;
            bwev.f159032b = 1;
            bwev.f159031a |= 1;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("parameters");
            if (optJSONObject2 != null) {
                String a2 = awjn.m80013a(optJSONObject2.optString("gateway"));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwev bwev2 = (bwev) da.f164949b;
                a2.getClass();
                bwev2.f159031a |= 2;
                bwev2.f159033c = a2;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwev bwev3 = (bwev) da.f164949b;
                "".getClass();
                bwev3.f159031a |= 2;
                bwev3.f159033c = "";
            }
        } else if ("NETWORK_TOKEN".equals(optString)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwev bwev4 = (bwev) da.f164949b;
            bwev4.f159032b = 2;
            bwev4.f159031a |= 1;
        } else if ("DIRECT".equals(optString)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwev bwev5 = (bwev) da.f164949b;
            bwev5.f159032b = 3;
            bwev5.f159031a |= 1;
        }
        return (bwev) da.mo74062i();
    }

    /* renamed from: c */
    private static int[] m80866c(String str, String str2) {
        String[] b = m80861b(str, str2);
        return new int[]{Integer.parseInt(b[0]), Integer.parseInt(b[1])};
    }

    /* renamed from: d */
    static String m80869d(int i, awru awru) {
        if (i == 1) {
            return "NOT_CURRENTLY_KNOWN";
        }
        if (i == 2) {
            return "ESTIMATED";
        }
        if (i == 3) {
            return "FINAL";
        }
        awru.mo52515a(String.format(Locale.US, "Invalid total price status: %d", Integer.valueOf(i)), 1090);
        return "";
    }

    /* renamed from: d */
    public static List m80870d(JSONObject jSONObject, awru awru) {
        String a;
        if (jSONObject != null && m80863c(jSONObject, awru) >= 2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = (JSONObject) m80829a(jSONObject, "transactionInfo", JSONObject.class, 1074, awru);
            String str = (String) m80829a(jSONObject2, "totalPriceStatus", String.class, 1090, awru);
            if (!(jSONObject2 == null || str == null || ((!str.equals("ESTIMATED") && !str.equals("FINAL")) || (a = m80837a(jSONObject2, "currencyCode", "transactionInfo", awru)) == null))) {
                String str2 = (String) m80830a(jSONObject2, "totalPrice", (String) null, String.class, 1089, awru);
                m80806a(str2, "transactionInfo.totalPrice", awru);
                if (awru.f94946a.isEmpty()) {
                    bxvd da = bweb.f158956f.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bweb bweb = (bweb) da.f164949b;
                    a.getClass();
                    int i = bweb.f158958a | 4;
                    bweb.f158958a = i;
                    bweb.f158961d = a;
                    str2.getClass();
                    int i2 = i | 2;
                    bweb.f158958a = i2;
                    bweb.f158960c = str2;
                    bweb.f158962e = 5;
                    bweb.f158958a = i2 | 8;
                    arrayList.add((bweb) da.mo74062i());
                    return arrayList;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static long m80807a(Random random, int i, TimeUnit timeUnit) {
        boolean z;
        long millis = timeUnit.toMillis(1);
        boolean z2 = true;
        if (millis < 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "timeUnitInMillis should not overflow int!");
        if (i <= 0) {
            z2 = false;
        }
        sdo.m34975b(z2, "maxUnitsExclusive should be positive!");
        return (((long) random.nextInt(i)) * millis) + ((long) random.nextInt((int) millis));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* renamed from: a */
    static Account m80808a(Context context, Account[] accountArr, JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            awru awru = new awru();
            JSONObject jSONObject2 = (JSONObject) m80829a(jSONObject, "i", JSONObject.class, 1, awru);
            if (jSONObject2 != null) {
                str = (String) m80829a(jSONObject2, "preferredAccountId", String.class, 1, awru);
                if (str != null) {
                    int length = accountArr.length;
                    int i = 0;
                    while (i < length) {
                        Account account = accountArr[i];
                        try {
                            if (str.equals(gie.m13198c(context, account.name))) {
                                return account;
                            }
                            i++;
                        } catch (gid | IOException e) {
                            Log.w("IbServiceUtilsError", String.format("Failed to get account id from account name: %s", account.name));
                        }
                    }
                }
                return null;
            }
        }
        str = null;
        if (str != null) {
        }
        return null;
    }

    /* renamed from: a */
    public static Account m80809a(Account[] accountArr, Bundle bundle, rfz rfz, awwt awwt, awta awta) {
        return m80810a(accountArr, m80827a(bundle, (String) null), rfz, awwt, awta);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* renamed from: a */
    public static Account m80810a(Account[] accountArr, BuyFlowConfig buyFlowConfig, rfz rfz, awwt awwt, awta awta) {
        Account account;
        Account account2;
        AccountInfo accountInfo;
        Account[] accountArr2 = accountArr;
        BuyFlowConfig buyFlowConfig2 = buyFlowConfig;
        Account account3 = null;
        r10 = null;
        String str = null;
        account3 = null;
        if (accountArr2 != null && accountArr2.length > 0) {
            Account account4 = buyFlowConfig2.f110418b.f110407b;
            if (account4 != null && rfz.mo24610b(buyFlowConfig2.f110419c)) {
                String str2 = account4.name;
                int i = 0;
                while (true) {
                    if (i >= accountArr2.length) {
                        break;
                    } else if (accountArr2[i].name.equals(str2)) {
                        account = accountArr2[i];
                        break;
                    } else {
                        i++;
                    }
                }
            }
            account = null;
            if (account == null) {
                int i2 = buyFlowConfig2.f110418b.f110406a;
                String str3 = buyFlowConfig2.f110419c;
                long j = 0;
                Account account5 = null;
                for (Account account6 : accountArr2) {
                    byal a = awta.mo52547a(i2, account6, str3);
                    if (a != null) {
                        long j2 = a.f165282b;
                        if (j2 > j) {
                            account5 = account6;
                            j = j2;
                        }
                    }
                }
                account2 = account5;
            } else {
                account2 = account;
            }
            if (account2 == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bjut d = awwt.mo52690a(buyFlowConfig2).mo65558d();
                awwt.mo52691a(4, null, null, elapsedRealtime, d, 0, buyFlowConfig);
                if (d.f123368a.mo17710c()) {
                    GetActiveAccountResponse getActiveAccountResponse = d.f123369b;
                    if (!(getActiveAccountResponse == null || (accountInfo = getActiveAccountResponse.f108366a) == null)) {
                        str = accountInfo.f108326b;
                    }
                    if (str != null) {
                        account3 = new Account(str, "com.google");
                        if (account3 == null) {
                            return accountArr2[0];
                        }
                    }
                }
            }
            account3 = account2;
            if (account3 == null) {
            }
        }
        return account3;
    }

    /* renamed from: b */
    static String m80858b(int i, awru awru) {
        if (i == 1) {
            return "CARD";
        }
        if (i == 2) {
            return "TOKENIZED_CARD";
        }
        awru.mo52515a(String.format(Locale.US, "Invalid payment method type: %d", Integer.valueOf(i)), 1079);
        return "";
    }

    /* renamed from: b */
    public static List m80859b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(Integer.valueOf(m80871e(jSONArray.optString(i))));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Bundle m80811a(Context context, Intent intent) {
        PendingIntent a = spn.m35844a(context, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY);
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT", a);
        return bundle;
    }

    /* renamed from: b */
    private static String[] m80861b(String str, String str2) {
        boolean z;
        String[] split = str2.split(Pattern.quote(str), -1);
        if (split.length == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "should have exactly only have two parts separated by %s in %s", str, str2);
        split[0] = split[0].trim();
        split[1] = split[1].trim();
        return split;
    }

    /* renamed from: a */
    public static Bundle m80812a(CallbackOutput callbackOutput) {
        PaymentAuthorizationResult paymentAuthorizationResult;
        int i = callbackOutput.f110031a;
        if (i == 2) {
            PaymentDataRequestUpdate paymentDataRequestUpdate = (PaymentDataRequestUpdate) callbackOutput.mo59825a(PaymentDataRequestUpdate.CREATOR);
            if (paymentDataRequestUpdate != null) {
                return paymentDataRequestUpdate.f110040b;
            }
            return null;
        } else if (i != 1 || (paymentAuthorizationResult = (PaymentAuthorizationResult) callbackOutput.mo59825a(PaymentAuthorizationResult.CREATOR)) == null) {
            return null;
        } else {
            return paymentAuthorizationResult.f110038b;
        }
    }

    /* renamed from: a */
    public static bwdx m80813a(JSONArray jSONArray) {
        if (jSONArray != null) {
            bxvd da = bwdx.f158952b.mo74144da();
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                Object opt = jSONArray.opt(i);
                if (opt instanceof String) {
                    bxvd da2 = bwdw.f158948c.mo74144da();
                    String str = (String) opt;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bwdw bwdw = (bwdw) da2.f164949b;
                    str.getClass();
                    bwdw.f158950a |= 1;
                    bwdw.f158951b = str;
                    arrayList.add((bwdw) da2.mo74062i());
                }
            }
            if (!arrayList.isEmpty()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwdx bwdx = (bwdx) da.f164949b;
                bwdx.mo73517a();
                bxsy.m123078a(arrayList, bwdx.f158954a);
                return (bwdx) da.mo74062i();
            }
        }
        return null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026b  */
    /* renamed from: a */
    public static bwef m80814a(CallbackOutput callbackOutput, PaymentDataRequestUpdate paymentDataRequestUpdate, awru awru) {
        ArrayList arrayList;
        JSONObject jSONObject;
        ArrayList arrayList2;
        String str;
        String str2;
        char c;
        int i;
        CallbackOutput callbackOutput2 = callbackOutput;
        PaymentDataRequestUpdate paymentDataRequestUpdate2 = paymentDataRequestUpdate;
        awru awru2 = awru;
        bwdy bwdy = (bwdy) bwef.f158969g.mo74144da();
        if (paymentDataRequestUpdate2 != null) {
            String str3 = paymentDataRequestUpdate2.f110039a;
            if (bwdy.f164950c) {
                bwdy.mo74035c();
                bwdy.f164950c = false;
            }
            bwef bwef = (bwef) bwdy.f164949b;
            str3.getClass();
            bwef.f158971a |= 4;
            bwef.f158976f = str3;
        }
        int i2 = callbackOutput2.f110031a;
        int i3 = 1;
        if (i2 == 2) {
            JSONObject jSONObject2 = new JSONObject(((PaymentDataRequestUpdate) callbackOutput2.mo59825a(PaymentDataRequestUpdate.CREATOR)).f110039a);
            JSONObject jSONObject3 = (JSONObject) m80829a(jSONObject2, "newTransactionInfo", JSONObject.class, 1091, awru2);
            if (jSONObject3 != null) {
                ArrayList arrayList3 = new ArrayList();
                String a = m80837a(jSONObject3, "currencyCode", "newTransactionInfo", awru2);
                if (a != null) {
                    JSONArray jSONArray = (JSONArray) m80829a(jSONObject3, "displayItems", JSONArray.class, 1094, awru2);
                    if (jSONArray == null) {
                        arrayList2 = arrayList3;
                        jSONObject = jSONObject3;
                        str = a;
                    } else {
                        int i4 = 0;
                        while (i4 < jSONArray.length()) {
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                            String format = String.format(Locale.US, "%s.displayItem[%d]", "newTransactionInfo", Integer.valueOf(i4));
                            int i5 = i4;
                            JSONObject jSONObject5 = jSONObject4;
                            JSONArray jSONArray2 = jSONArray;
                            String str4 = a;
                            ArrayList arrayList4 = arrayList3;
                            JSONObject jSONObject6 = jSONObject3;
                            String str5 = (String) m80830a(jSONObject4, "label", format, String.class, 1093, awru);
                            String str6 = (String) m80830a(jSONObject5, "type", format, String.class, 1093, awru);
                            String str7 = (String) m80830a(jSONObject5, "price", format, String.class, 1093, awru);
                            if (!TextUtils.isEmpty(str7)) {
                                if (!f94945e.matcher(str7).matches()) {
                                    awru2.mo52515a(String.format(Locale.US, "%s.%s is in wrong format", format, "price"), 1093);
                                }
                                String str8 = str5;
                                if (str8 == null || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
                                    arrayList = null;
                                    if (arrayList != null) {
                                        bwdy.mo73518a(arrayList);
                                    }
                                } else {
                                    String str9 = (String) m80829a(jSONObject5, "status", String.class, 1093, awru2);
                                    if ((str9 != null || awru2.f94946a.contains("status must be a String")) && str9.equals("PENDING")) {
                                        str2 = str4;
                                    } else {
                                        bxvd da = bweb.f158956f.mo74144da();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bweb bweb = (bweb) da.f164949b;
                                        str8.getClass();
                                        int i6 = bweb.f158958a | 1;
                                        bweb.f158958a = i6;
                                        bweb.f158959b = str8;
                                        switch (str6.hashCode()) {
                                            case -1277692668:
                                                if (str6.equals("SUBTOTAL")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 82827:
                                                if (str6.equals("TAX")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 80012068:
                                                if (str6.equals("TOTAL")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1019763838:
                                                if (str6.equals("LINE_ITEM")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1055810881:
                                                if (str6.equals("DISCOUNT")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        if (c != 0) {
                                            i = c != 1 ? c != 2 ? c != 3 ? c != 4 ? 1 : 5 : 6 : 4 : 3;
                                        } else {
                                            i = 2;
                                        }
                                        bweb.f158962e = i - 1;
                                        int i7 = i6 | 8;
                                        bweb.f158958a = i7;
                                        str4.getClass();
                                        int i8 = i7 | 4;
                                        bweb.f158958a = i8;
                                        str2 = str4;
                                        bweb.f158961d = str2;
                                        if (str7 != null) {
                                            str7.getClass();
                                            bweb.f158958a = i8 | 2;
                                            bweb.f158960c = str7;
                                            arrayList4.add((bweb) da.mo74062i());
                                        } else {
                                            arrayList = null;
                                            if (arrayList != null) {
                                            }
                                        }
                                    }
                                    i4 = i5 + 1;
                                    a = str2;
                                    arrayList3 = arrayList4;
                                    jSONObject3 = jSONObject6;
                                    jSONArray = jSONArray2;
                                }
                            } else {
                                awru2.mo52515a(String.format(Locale.US, "%s.%s is required", format, "price"), 1026);
                            }
                        }
                        arrayList2 = arrayList3;
                        jSONObject = jSONObject3;
                        str = a;
                    }
                    String str10 = (String) m80829a(jSONObject, "totalPriceLabel", String.class, 1095, awru2);
                    String str11 = (String) m80829a(jSONObject, "totalPrice", String.class, 1089, awru2);
                    if (str11 != null) {
                        if (f94944d.matcher(str11).matches()) {
                            bxvd da2 = bweb.f158956f.mo74144da();
                            if (str10 == null) {
                                str10 = "Final";
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bweb bweb2 = (bweb) da2.f164949b;
                            str10.getClass();
                            int i9 = bweb2.f158958a | 1;
                            bweb2.f158958a = i9;
                            bweb2.f158959b = str10;
                            str11.getClass();
                            int i10 = i9 | 2;
                            bweb2.f158958a = i10;
                            bweb2.f158960c = str11;
                            bweb2.f158962e = 5;
                            int i11 = i10 | 8;
                            bweb2.f158958a = i11;
                            str.getClass();
                            bweb2.f158958a = i11 | 4;
                            bweb2.f158961d = str;
                            arrayList2.add((bweb) da2.mo74062i());
                        } else {
                            arrayList = null;
                            if (arrayList != null) {
                            }
                        }
                    }
                    arrayList = arrayList2;
                    if (arrayList != null) {
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                }
            }
            JSONObject jSONObject7 = (JSONObject) m80829a(jSONObject2, "newShippingOptionParameters", JSONObject.class, 1098, awru2);
            if (jSONObject7 != null) {
                JSONArray jSONArray3 = (JSONArray) m80830a(jSONObject7, "shippingOptions", "newShippingOptionParameters", JSONArray.class, 1100, awru);
                if (jSONArray3 == null) {
                    return null;
                }
                int i12 = 0;
                while (i12 < jSONArray3.length()) {
                    JSONObject jSONObject8 = jSONArray3.getJSONObject(i12);
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[i3];
                    Integer valueOf = Integer.valueOf(i12);
                    objArr[0] = valueOf;
                    String str12 = (String) m80830a(jSONObject8, "id", String.format(locale, "newShippingOptionParameters.shippingOption[%d]", objArr), String.class, 1100, awru);
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[i3];
                    objArr2[0] = valueOf;
                    String str13 = str12;
                    String str14 = (String) m80830a(jSONObject8, "label", String.format(locale2, "newShippingOptionParameters.shippingOption[%d]", objArr2), String.class, 1100, awru);
                    String str15 = (String) m80829a(jSONObject8, "description", String.class, 1100, awru2);
                    if (str13 == null || str14 == null) {
                        return null;
                    }
                    bxvd da3 = bwdm.f158904d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bwdm bwdm = (bwdm) da3.f164949b;
                    bwdm.f158907b = 2;
                    bwdm.f158906a |= i3;
                    String jSONObject9 = new JSONObject().put("id", str13).toString();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bwdm bwdm2 = (bwdm) da3.f164949b;
                    jSONObject9.getClass();
                    bwdm2.f158906a |= 2;
                    bwdm2.f158908c = jSONObject9;
                    bwdm bwdm3 = (bwdm) da3.mo74062i();
                    bxvd da4 = bwds.f158924f.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bwds bwds = (bwds) da4.f164949b;
                    str13.getClass();
                    int i13 = bwds.f158926a | 1;
                    bwds.f158926a = i13;
                    bwds.f158927b = str13;
                    str14.getClass();
                    int i14 = i13 | 2;
                    bwds.f158926a = i14;
                    bwds.f158928c = str14;
                    bwdm3.getClass();
                    bwds.f158930e = bwdm3;
                    bwds.f158926a = i14 | 8;
                    if (str15 != null) {
                        String string = jSONObject8.getString("description");
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bwds bwds2 = (bwds) da4.f164949b;
                        string.getClass();
                        bwds2.f158926a |= 4;
                        bwds2.f158929d = string;
                    }
                    if (bwdy.f164950c) {
                        bwdy.mo74035c();
                        bwdy.f164950c = false;
                    }
                    bwef bwef2 = (bwef) bwdy.f164949b;
                    bwds bwds3 = (bwds) da4.mo74062i();
                    bwds3.getClass();
                    if (!bwef2.f158973c.mo73666a()) {
                        bwef2.f158973c = bxvk.m124021a(bwef2.f158973c);
                    }
                    bwef2.f158973c.add(bwds3);
                    i12++;
                    i3 = 1;
                }
                String str16 = (String) m80829a(jSONObject7, "defaultSelectedOptionId", String.class, 1099, awru2);
                if (str16 != null) {
                    Iterator it = Collections.unmodifiableList(((bwef) bwdy.f164949b).f158973c).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            awru2.mo52515a(String.format(Locale.US, "Default shipping option(\"%s\") is not present in shipping options list.", str16), 1099);
                        } else if (str16.equals(((bwds) it.next()).f158927b)) {
                            if (bwdy.f164950c) {
                                bwdy.mo74035c();
                                bwdy.f164950c = false;
                            }
                            bwef bwef3 = (bwef) bwdy.f164949b;
                            str16.getClass();
                            bwef3.f158971a |= 1;
                            bwef3.f158974d = str16;
                        }
                    }
                }
            }
            bwee i15 = m80876i(jSONObject2, awru2);
            if (i15 != null) {
                if (bwdy.f164950c) {
                    bwdy.mo74035c();
                    bwdy.f164950c = false;
                }
                bwef bwef4 = (bwef) bwdy.f164949b;
                i15.getClass();
                bwef4.f158975e = i15;
                bwef4.f158971a |= 2;
            }
        } else {
            char c2 = 65535;
            if (i2 == 1) {
                JSONObject jSONObject10 = new JSONObject(((PaymentAuthorizationResult) callbackOutput2.mo59825a(PaymentAuthorizationResult.CREATOR)).f110037a);
                String str17 = (String) m80830a(jSONObject10, "transactionState", "paymentAuthorizationResult", String.class, 1102, awru);
                if (str17 == null) {
                    return null;
                }
                int hashCode = str17.hashCode();
                if (hashCode != -1149187101) {
                    if (hashCode == 66247144 && str17.equals("ERROR")) {
                        c2 = 1;
                    }
                } else if (str17.equals("SUCCESS")) {
                    c2 = 0;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        awru2.mo52515a("paymentAuthorizationResult.transactionState must be either ERROR or SUCCESS!", 1102);
                    } else {
                        bwee i16 = m80876i(jSONObject10, awru2);
                        if (i16 != null) {
                            if (bwdy.f164950c) {
                                bwdy.mo74035c();
                                bwdy.f164950c = false;
                            }
                            bwef bwef5 = (bwef) bwdy.f164949b;
                            i16.getClass();
                            bwef5.f158975e = i16;
                            bwef5.f158971a |= 2;
                        }
                    }
                }
            }
        }
        return (bwef) bwdy.mo74062i();
    }

    /* renamed from: a */
    public static bwev m80815a(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
        bxvd da = bwev.f159029d.mo74144da();
        if (paymentMethodTokenizationParameters != null) {
            int i = paymentMethodTokenizationParameters.f109897a;
            int i2 = 3;
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = i != 3 ? 1 : 4;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwev bwev = (bwev) da.f164949b;
            int i3 = i2 - 1;
            bwev.f159032b = i3;
            bwev.f159031a = 1 | bwev.f159031a;
            int a = bweu.m121892a(i3);
            if (a != 0 && a == 2) {
                String a2 = awjn.m80013a(paymentMethodTokenizationParameters.mo59770a().getString("gateway"));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwev bwev2 = (bwev) da.f164949b;
                a2.getClass();
                bwev2.f159031a |= 2;
                bwev2.f159033c = a2;
            }
        }
        return (bwev) da.mo74062i();
    }

    /* renamed from: a */
    public static bwev m80816a(IbBuyFlowInput ibBuyFlowInput) {
        bxvd da = bwev.f159029d.mo74144da();
        int n = ibBuyFlowInput.mo60006n();
        int i = n - 1;
        if (n != 0) {
            int i2 = 3;
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = i != 3 ? 1 : 4;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwev bwev = (bwev) da.f164949b;
            int i3 = i2 - 1;
            bwev.f159032b = i3;
            bwev.f159031a = 1 | bwev.f159031a;
            int a = bweu.m121892a(i3);
            if (a != 0 && a == 2) {
                String a2 = awjn.m80013a(ibBuyFlowInput.mo59988c("gateway"));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwev bwev2 = (bwev) da.f164949b;
                a2.getClass();
                bwev2.f159031a |= 2;
                bwev2.f159033c = a2;
            }
            return (bwev) da.mo74062i();
        }
        throw null;
    }

    /* renamed from: a */
    public static bwgu m80817a(btrn btrn) {
        bxvd da = bwgu.f159265i.mo74144da();
        String str = btrn.f150124e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgu bwgu = (bwgu) da.f164949b;
        str.getClass();
        if (!bwgu.f159272f.mo73666a()) {
            bwgu.f159272f = bxvk.m124021a(bwgu.f159272f);
        }
        bwgu.f159272f.add(str);
        String str2 = btrn.f150120a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgu bwgu2 = (bwgu) da.f164949b;
        str2.getClass();
        int i = bwgu2.f159267a | 1;
        bwgu2.f159267a = i;
        bwgu2.f159268b = str2;
        int i2 = btrn.f150123d;
        int i3 = i | 2;
        bwgu2.f159267a = i3;
        bwgu2.f159269c = i2;
        int i4 = btrn.f150126g;
        bwgu2.f159267a = i3 | 4;
        bwgu2.f159273g = i4;
        bxwc bxwc = btrn.f150122c;
        if (!bwgu2.f159271e.mo73666a()) {
            bwgu2.f159271e = bxvk.m124021a(bwgu2.f159271e);
        }
        bxsy.m123078a(bxwc, bwgu2.f159271e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgu bwgu3 = (bwgu) da.f164949b;
        bwgu3.f159267a |= 8;
        bwgu3.f159274h = false;
        for (int i5 = 0; i5 < btrn.f150125f.size(); i5++) {
            btrm btrm = (btrm) btrn.f150125f.get(i5);
            bxvd da2 = bwgt.f159260d.mo74144da();
            String str3 = btrm.f150116a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwgt bwgt = (bwgt) da2.f164949b;
            str3.getClass();
            int i6 = bwgt.f159262a | 1;
            bwgt.f159262a = i6;
            bwgt.f159263b = str3;
            String str4 = btrm.f150117b;
            str4.getClass();
            bwgt.f159262a = i6 | 2;
            bwgt.f159264c = str4;
            bwgt bwgt2 = (bwgt) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgu bwgu4 = (bwgu) da.f164949b;
            bwgt2.getClass();
            if (!bwgu4.f159270d.mo73666a()) {
                bwgu4.f159270d = bxvk.m124021a(bwgu4.f159270d);
            }
            bwgu4.f159270d.add(bwgt2);
        }
        return (bwgu) da.mo74062i();
    }

    /* renamed from: a */
    static UserAddress m80818a(blzr blzr, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (blzr == null) {
            return null;
        }
        adda a = UserAddress.m66752a();
        a.mo33334l(blzr.f128385d);
        a.mo33331i(awjn.m80013a(str));
        if ((blzr.f128382a & 2) != 0) {
            btwp btwp = blzr.f128384c;
            if (btwp == null) {
                btwp = btwp.f152728s;
            }
            a.mo33333k(btwp.f152747r);
            int size = btwp.f152745p.size();
            String str6 = "";
            if (size > 0) {
                str2 = (String) btwp.f152745p.get(0);
            } else {
                str2 = str6;
            }
            a.mo33323a(str2);
            if (size >= 2) {
                str3 = (String) btwp.f152745p.get(1);
            } else {
                str3 = str6;
            }
            a.mo33324b(str3);
            if (size >= 3) {
                str4 = (String) btwp.f152745p.get(2);
            } else {
                str4 = str6;
            }
            a.mo33325c(str4);
            if (size >= 4) {
                str5 = (String) btwp.f152745p.get(3);
            } else {
                str5 = str6;
            }
            a.mo33326d(str5);
            if (size >= 5) {
                str6 = (String) btwp.f152745p.get(4);
            }
            a.mo33327e(str6);
            a.mo33330h(btwp.f152731b);
            a.mo33332j(btwp.f152736g);
            a.mo33328f(btwp.f152734e);
            a.mo33335m(btwp.f152740k);
            a.mo33336n(awjn.m80013a(btwp.f152741l));
            a.mo33329g(awjn.m80013a(btwp.f152746q));
            a.mo33333k(awjn.m80013a(btwp.f152747r));
        }
        return a.f61429a;
    }

    /* renamed from: a */
    static Address m80819a(blzr blzr) {
        String str;
        String str2;
        if (blzr == null) {
            return null;
        }
        awaf awaf = new awaf(new Address());
        awaf.f94131a.f109764i = blzr.f128385d;
        if ((blzr.f128382a & 2) != 0) {
            btwp btwp = blzr.f128384c;
            if (btwp == null) {
                btwp = btwp.f152728s;
            }
            awaf.mo51777a(btwp.f152747r);
            int size = btwp.f152745p.size();
            String str3 = "";
            if (size > 0) {
                str = (String) btwp.f152745p.get(0);
            } else {
                str = str3;
            }
            awaf.f94131a.f109757b = str;
            if (size >= 2) {
                str2 = (String) btwp.f152745p.get(1);
            } else {
                str2 = str3;
            }
            awaf.f94131a.f109758c = str2;
            if (size >= 3) {
                str3 = (String) btwp.f152745p.get(2);
            }
            Address address = awaf.f94131a;
            address.f109759d = str3;
            address.f109760e = btwp.f152731b;
            address.f109761f = btwp.f152736g;
            address.f109762g = btwp.f152734e;
            address.f109763h = btwp.f152740k;
            address.f109766k = awjn.m80013a(btwp.f152746q);
            awaf.mo51777a(awjn.m80013a(btwp.f152747r));
        }
        return awaf.f94131a;
    }

    /* renamed from: a */
    public static FullWallet m80820a(blzw blzw, String str, String str2, String str3, int i) {
        awap a = FullWallet.m93786a();
        if ((blzw.f128405a & 8) != 0) {
            blzx blzx = blzw.f128409e;
            if (blzx == null) {
                blzx = blzx.f128415c;
            }
            a.f94139a.f109794k = m80824a(blzx, i);
        }
        if ((blzw.f128405a & 2) != 0) {
            InstrumentInfo[] instrumentInfoArr = new InstrumentInfo[1];
            blzu blzu = blzw.f128407c;
            if (blzu == null) {
                blzu = blzu.f128387j;
            }
            instrumentInfoArr[0] = m80821a(blzu);
            a.f94139a.f109793j = instrumentInfoArr;
            String[] strArr = new String[1];
            blzu blzu2 = blzw.f128407c;
            if (blzu2 == null) {
                blzu2 = blzu.f128387j;
            }
            strArr[0] = blzu2.f128392d;
            a.f94139a.f109790g = strArr;
            blzu blzu3 = blzw.f128407c;
            if (blzu3 == null) {
                blzu3 = blzu.f128387j;
            }
            if ((blzu3.f128389a & 32) != 0) {
                blzu blzu4 = blzw.f128407c;
                if (blzu4 == null) {
                    blzu4 = blzu.f128387j;
                }
                blzr blzr = blzu4.f128395g;
                if (blzr == null) {
                    blzr = blzr.f128380e;
                }
                a.f94139a.f109788e = m80819a(blzr);
                blzu blzu5 = blzw.f128407c;
                if (blzu5 == null) {
                    blzu5 = blzu.f128387j;
                }
                blzr blzr2 = blzu5.f128395g;
                if (blzr2 == null) {
                    blzr2 = blzr.f128380e;
                }
                a.f94139a.f109791h = m80818a(blzr2, str);
            }
        }
        if ((blzw.f128405a & 4) != 0) {
            blzr blzr3 = blzw.f128408d;
            if (blzr3 == null) {
                blzr3 = blzr.f128380e;
            }
            a.f94139a.f109789f = m80819a(blzr3);
            blzr blzr4 = blzw.f128408d;
            if (blzr4 == null) {
                blzr4 = blzr.f128380e;
            }
            a.f94139a.f109792i = m80818a(blzr4, str);
        }
        a.mo51790a(str2);
        a.mo51791b(str3);
        FullWallet fullWallet = a.f94139a;
        fullWallet.f109787d = str;
        return fullWallet;
    }

    /* renamed from: a */
    static InstrumentInfo m80821a(blzu blzu) {
        awau awau = new awau(new InstrumentInfo());
        String str = blzu.f128393e;
        InstrumentInfo instrumentInfo = awau.f94141a;
        instrumentInfo.f109806a = str;
        instrumentInfo.f109807b = blzu.f128394f;
        int a = blzt.m107818a(blzu.f128391c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? 0 : 3 : 2;
        }
        InstrumentInfo instrumentInfo2 = awau.f94141a;
        instrumentInfo2.f109808c = i;
        return instrumentInfo2;
    }

    /* renamed from: a */
    public static MaskedWallet m80822a(blzw blzw, String str, String str2, String str3) {
        awbb a = MaskedWallet.m93790a();
        if ((blzw.f128405a & 2) != 0) {
            InstrumentInfo[] instrumentInfoArr = new InstrumentInfo[1];
            blzu blzu = blzw.f128407c;
            if (blzu == null) {
                blzu = blzu.f128387j;
            }
            instrumentInfoArr[0] = m80821a(blzu);
            a.f94143a.f109855k = instrumentInfoArr;
            String[] strArr = new String[1];
            blzu blzu2 = blzw.f128407c;
            if (blzu2 == null) {
                blzu2 = blzu.f128387j;
            }
            strArr[0] = blzu2.f128392d;
            a.f94143a.f109847c = strArr;
            blzu blzu3 = blzw.f128407c;
            if (blzu3 == null) {
                blzu3 = blzu.f128387j;
            }
            if ((blzu3.f128389a & 32) != 0) {
                blzu blzu4 = blzw.f128407c;
                if (blzu4 == null) {
                    blzu4 = blzu.f128387j;
                }
                blzr blzr = blzu4.f128395g;
                if (blzr == null) {
                    blzr = blzr.f128380e;
                }
                a.f94143a.f109849e = m80819a(blzr);
                blzu blzu5 = blzw.f128407c;
                if (blzu5 == null) {
                    blzu5 = blzu.f128387j;
                }
                blzr blzr2 = blzu5.f128395g;
                if (blzr2 == null) {
                    blzr2 = blzr.f128380e;
                }
                a.f94143a.f109853i = m80818a(blzr2, str);
            }
        }
        if ((blzw.f128405a & 4) != 0) {
            blzr blzr3 = blzw.f128408d;
            if (blzr3 == null) {
                blzr3 = blzr.f128380e;
            }
            a.f94143a.f109850f = m80819a(blzr3);
            blzr blzr4 = blzw.f128408d;
            if (blzr4 == null) {
                blzr4 = blzr.f128380e;
            }
            a.f94143a.f109854j = m80818a(blzr4, str);
        }
        a.mo51808a(str2);
        a.mo51809b(str3);
        MaskedWallet maskedWallet = a.f94143a;
        maskedWallet.f109848d = str;
        return maskedWallet;
    }

    /* renamed from: a */
    public static PaymentData m80823a(blzw blzw, String str, boolean z, int i, String str2) {
        if (!TextUtils.isEmpty(blzw.f128413i)) {
            return PaymentData.m93792a(blzw.f128413i);
        }
        awbh a = PaymentData.m93791a();
        PaymentData paymentData = a.f94145a;
        paymentData.f109880e = str2;
        if (z) {
            paymentData.f109876a = str;
        }
        if ((blzw.f128405a & 8) != 0) {
            blzx blzx = blzw.f128409e;
            if (blzx == null) {
                blzx = blzx.f128415c;
            }
            a.f94145a.f109879d = m80824a(blzx, i);
        }
        int i2 = 2;
        if ((blzw.f128405a & 2) != 0) {
            awai awai = new awai(new CardInfo());
            blzu blzu = blzw.f128407c;
            if (blzu == null) {
                blzu = blzu.f128387j;
            }
            awai.f94132a.f109767a = blzu.f128392d;
            blzu blzu2 = blzw.f128407c;
            if (blzu2 == null) {
                blzu2 = blzu.f128387j;
            }
            awai.f94132a.f109768b = blzu2.f128393e;
            blzu blzu3 = blzw.f128407c;
            if (blzu3 == null) {
                blzu3 = blzu.f128387j;
            }
            awai.f94132a.f109769c = blzu3.f128394f;
            blzu blzu4 = blzw.f128407c;
            if (blzu4 == null) {
                blzu4 = blzu.f128387j;
            }
            int a2 = blzt.m107818a(blzu4.f128391c);
            if (a2 == 0) {
                a2 = 1;
            }
            int i3 = a2 - 1;
            if (i3 == 1) {
                i2 = 1;
            } else if (i3 != 2) {
                i2 = i3 != 3 ? 0 : 3;
            }
            awai.f94132a.f109770d = i2;
            blzu blzu5 = blzw.f128407c;
            if (blzu5 == null) {
                blzu5 = blzu.f128387j;
            }
            if ((blzu5.f128389a & 32) != 0) {
                blzu blzu6 = blzw.f128407c;
                if (blzu6 == null) {
                    blzu6 = blzu.f128387j;
                }
                blzr blzr = blzu6.f128395g;
                if (blzr == null) {
                    blzr = blzr.f128380e;
                }
                awai.f94132a.f109771e = m80818a(blzr, str);
            }
            a.f94145a.f109877b = awai.f94132a;
        }
        if ((blzw.f128405a & 4) != 0) {
            blzr blzr2 = blzw.f128408d;
            if (blzr2 == null) {
                blzr2 = blzr.f128380e;
            }
            a.f94145a.f109878c = m80818a(blzr2, str);
        }
        bxwc bxwc = blzw.f128414j;
        int size = bxwc.size();
        for (int i4 = 0; i4 < size; i4++) {
            blzv blzv = (blzv) bxwc.get(i4);
            String str3 = blzv.f128400a;
            String str4 = blzv.f128401b;
            PaymentData paymentData2 = a.f94145a;
            if (paymentData2.f109881f == null) {
                paymentData2.f109881f = new Bundle();
            }
            a.f94145a.f109881f.putString(str3, str4);
        }
        return a.f94145a;
    }

    /* renamed from: a */
    private static PaymentMethodToken m80824a(blzx blzx, int i) {
        awbk awbk = new awbk(new PaymentMethodToken());
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                awbk.mo51822a(1);
            } else if (i2 == 2) {
                awbk.mo51822a(2);
            } else if (i2 == 3) {
                awbk.mo51822a(3);
            } else if (i != 0) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Unsupported tokenization type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                throw null;
            }
            String str = blzx.f128418b;
            PaymentMethodToken paymentMethodToken = awbk.f94146a;
            paymentMethodToken.f109896b = str;
            return paymentMethodToken;
        }
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static IntermediatePaymentData m80825a(bwdp bwdp) {
        String str;
        JSONObject jSONObject = new JSONObject();
        bxwc bxwc = bwdp.f158913b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bwdm bwdm = (bwdm) bxwc.get(i);
            JSONObject jSONObject2 = new JSONObject(bwdm.f158908c);
            int a = bwdl.m121855a(bwdm.f158907b);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                jSONObject.put("shippingAddress", jSONObject2);
            } else if (i2 == 2) {
                jSONObject.put("shippingOptionData", jSONObject2);
            } else if (i2 == 3) {
                jSONObject.put("paymentMethodData", jSONObject2);
            }
        }
        int a2 = bwdo.m121858a(bwdp.f158914c);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 != 1) {
            str = a2 != 2 ? a2 != 3 ? a2 != 4 ? a2 != 6 ? "SHIPPING_OPTION" : "PAYMENT_METHOD" : "SHIPPING_ADDRESS" : "OFFER" : "INITIALIZE";
        } else {
            str = "UNKNOWN_CALLBACK_TRIGGER";
        }
        jSONObject.put("callbackTrigger", str);
        String jSONObject3 = jSONObject.toString();
        sdo.m34966a((Object) jSONObject3, (Object) "JSON cannot be null!");
        return new IntermediatePaymentData(jSONObject3, null);
    }

    /* renamed from: a */
    public static PaymentDataRequestUpdate m80826a(CallbackOutput callbackOutput, PaymentDataRequestUpdate paymentDataRequestUpdate) {
        JSONObject jSONObject = new JSONObject();
        int i = callbackOutput.f110031a;
        if (i == 2) {
            jSONObject = new JSONObject(((PaymentDataRequestUpdate) callbackOutput.mo59825a(PaymentDataRequestUpdate.CREATOR)).f110039a);
        } else if (i == 1) {
            JSONObject jSONObject2 = new JSONObject(((PaymentAuthorizationResult) callbackOutput.mo59825a(PaymentAuthorizationResult.CREATOR)).f110037a);
            if (jSONObject2.has("error")) {
                jSONObject.put("error", jSONObject2.get("error"));
            }
        }
        if (paymentDataRequestUpdate == null) {
            return PaymentDataRequestUpdate.m93872a(jSONObject.toString());
        }
        JSONObject jSONObject3 = new JSONObject(paymentDataRequestUpdate.f110039a);
        if (!jSONObject.has("error")) {
            jSONObject3.remove("error");
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject.get(next));
        }
        return PaymentDataRequestUpdate.m93872a(jSONObject3.toString());
    }

    /* renamed from: a */
    public static BuyFlowConfig m80827a(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.setClassLoader(awrt.class.getClassLoader());
        if (str != null) {
            bundle2.putString("com.google.android.gms.wallet.EXTRA_ANALYTICS_TRANSACTION_ID_OVERRIDE", str);
        }
        String string = bundle2.getString("androidPackageName");
        awxz a = awfl.m79846a(bundle2);
        a.mo52743b(((Double) awie.f94425u.mo58455c()).doubleValue());
        a.mo52737a(((Double) awie.f94426v.mo58455c()).doubleValue());
        ApplicationParameters applicationParameters = a.f95270a;
        awyb a2 = BuyFlowConfig.m94175a();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        a2.mo52753d(str);
        a2.mo52751b(string);
        a2.mo52750a(string);
        a2.mo52752c("flow_instantbuy");
        a2.mo52749a(applicationParameters);
        return a2.mo52748a();
    }

    /* renamed from: a */
    static Object m80828a(JSONArray jSONArray, int i, String str, Class cls, int i2, awru awru) {
        try {
            Object obj = jSONArray.get(i);
            if (cls.isInstance(obj)) {
                return obj;
            }
            awru.mo52515a(String.format(Locale.US, "%s[%s] must be a %s!", str, Integer.valueOf(i), cls.getSimpleName()), i2);
            return null;
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m80829a(JSONObject jSONObject, String str, Class cls, int i, awru awru) {
        if (jSONObject != null) {
            try {
                Object obj = jSONObject.get(str);
                if (cls.isInstance(obj)) {
                    return obj;
                }
                awru.mo52515a(String.format(Locale.US, "%s must be a %s!", str, cls.getSimpleName()), i);
                return null;
            } catch (JSONException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static Object m80830a(JSONObject jSONObject, String str, String str2, Class cls, int i, awru awru) {
        Object a = m80829a(jSONObject, str, cls, i, awru);
        if (a == null || (cls == JSONArray.class && ((JSONArray) a).length() == 0)) {
            String format = String.format(Locale.US, "%s must be set", str);
            if (str2 != null) {
                format = String.format(Locale.US, "%s in %s", format, str2);
            }
            awru.mo52515a(String.valueOf(format).concat("!"), i);
        }
        return a;
    }

    /* renamed from: a */
    static String m80831a(int i, awru awru) {
        if (i == 1) {
            return "PAYMENT_GATEWAY";
        }
        if (i == 2) {
            return "NETWORK_TOKEN";
        }
        if (i == 3) {
            return "DIRECT";
        }
        awru.mo52515a(String.format(Locale.US, "Invalid payment method tokenization type: %d", Integer.valueOf(i)), 1044);
        return "";
    }

    /* renamed from: a */
    public static String m80832a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage();
    }

    /* renamed from: a */
    public static String m80833a(Bundle bundle, awru awru) {
        return m80834a(bundle, (JSONObject) null, awru);
    }

    /* renamed from: a */
    public static String m80834a(Bundle bundle, JSONObject jSONObject, awru awru) {
        String str;
        String str2;
        awru awru2 = new awru();
        JSONObject jSONObject2 = (JSONObject) m80829a(jSONObject, "i", JSONObject.class, 1, awru2);
        if (jSONObject2 != null && (str2 = (String) m80829a(jSONObject2, "googleTransactionId", String.class, 1, awru2)) != null) {
            return str2;
        }
        String uuid = UUID.randomUUID().toString();
        int b = awfl.m79847b(bundle);
        if (b == 0) {
            str = "SANDBOX";
        } else if (b == 1) {
            str = "PROD";
        } else if (b != 3) {
            switch (b) {
                case 21:
                case 22:
                    str = "DEV";
                    break;
                case 23:
                    str = "DEV_PIAB";
                    break;
                default:
                    awru.mo52515a(String.format(Locale.US, "Unknown environment: %d", Integer.valueOf(b)), 1060);
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "TEST";
        }
        return String.format(Locale.US, "%s.%s", uuid, str);
    }

    /* renamed from: a */
    static String m80835a(bwey bwey) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dpan", bwey.f159038b);
            jSONObject.put("expirationMonth", bwey.f159040d);
            jSONObject.put("expirationYear", bwey.f159041e);
            int a = bwex.m121895a(bwey.f159044h);
            if (a == 0) {
                a = 1;
            }
            if (a - 1 != 2) {
                jSONObject.put("authMethod", "3DS");
                jSONObject.put("3dsCryptogram", bwey.f159039c);
            } else {
                jSONObject.put("authMethod", "EMV");
                jSONObject.put("emvCryptogram", bwey.f159039c);
            }
            if (!bwey.f159042f.isEmpty()) {
                jSONObject.put("3dsEciIndicator", bwey.f159042f);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException("Error serializing NetworkToken to JSON.", e);
        }
    }

    /* renamed from: a */
    public static String m80836a(FullWallet fullWallet) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2 = new JSONObject();
        UserAddress userAddress = fullWallet.f109791h;
        JSONArray jSONArray2 = null;
        if (userAddress != null) {
            jSONObject = new JSONObject();
            jSONObject.put("address1", userAddress.f79118b).put("address2", userAddress.f79119c).put("address3", userAddress.f79120d).put("address4", userAddress.f79121e).put("address5", userAddress.f79122f).put("administrativeArea", userAddress.f79123g).put("companyName", userAddress.f79130n).put("countryCode", userAddress.f79125i).put("locality", userAddress.f79124h).put("name", userAddress.f79117a).put("postalCode", userAddress.f79126j).put("sortingCode", userAddress.f79127k);
        } else {
            jSONObject = null;
        }
        JSONObject put = jSONObject2.put("billingAddress", jSONObject);
        InstrumentInfo[] instrumentInfoArr = fullWallet.f109793j;
        if (instrumentInfoArr != null) {
            jSONArray = new JSONArray();
            for (InstrumentInfo instrumentInfo : instrumentInfoArr) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("instrumentType", instrumentInfo.f109806a).put("instrumentDetails", instrumentInfo.f109807b);
                jSONArray.put(jSONObject3);
            }
        } else {
            jSONArray = null;
        }
        JSONObject put2 = put.put("instrumentInfos", jSONArray);
        String[] strArr = fullWallet.f109790g;
        if (!(strArr == null || (r5 = strArr.length) == 0)) {
            jSONArray2 = new JSONArray();
            for (String str : strArr) {
                jSONArray2.put(str);
            }
        }
        put2.put("paymentDescriptions", jSONArray2);
        PaymentMethodToken paymentMethodToken = fullWallet.f109794k;
        if (paymentMethodToken != null) {
            jSONObject2.put("paymentMethodToken", paymentMethodToken.f109896b);
        }
        return jSONObject2.toString();
    }

    /* renamed from: a */
    private static String m80837a(JSONObject jSONObject, String str, String str2, awru awru) {
        String str3 = (String) m80830a(jSONObject, str, str2, String.class, 1088, awru);
        if (TextUtils.isEmpty(str3)) {
            awru.mo52515a(String.format(Locale.US, "%s.%s is required", str2, str), 1026);
            return null;
        }
        try {
            Currency.getInstance(str3);
            return str3;
        } catch (IllegalArgumentException e) {
            awru.mo52515a(String.format(Locale.US, "%s.%s is in wrong format", str2, str), 1088);
            return null;
        }
    }

    /* renamed from: a */
    public static ArrayList m80838a(com.google.android.gms.tapandpay.firstparty.CardInfo[] cardInfoArr) {
        int i;
        blwg blwg;
        if (cardInfoArr == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(cardInfoArr.length);
        for (int i2 = 0; i2 < cardInfoArr.length; i2++) {
            bxvd da = bmkr.f129866k.mo74144da();
            com.google.android.gms.tapandpay.firstparty.CardInfo cardInfo = cardInfoArr[i2];
            if (cardInfo != null) {
                String a = awjn.m80013a(cardInfo.f108340a);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmkr bmkr = (bmkr) da.f164949b;
                a.getClass();
                int i3 = 1;
                bmkr.f129868a |= 1;
                bmkr.f129869b = a;
                String a2 = awjn.m80013a(cardInfoArr[i2].f108346g);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmkr bmkr2 = (bmkr) da.f164949b;
                a2.getClass();
                int i4 = bmkr2.f129868a | 32;
                bmkr2.f129868a = i4;
                bmkr2.f129874g = a2;
                com.google.android.gms.tapandpay.firstparty.CardInfo cardInfo2 = cardInfoArr[i2];
                int i5 = cardInfo2.f108357r;
                if (i5 != 1) {
                    i = i5 != 2 ? i5 != 3 ? 1 : 4 : 3;
                } else {
                    i = 2;
                }
                bmkr2.f129876i = i - 1;
                bmkr2.f129868a = i4 | 128;
                switch (cardInfo2.f108344e) {
                    case 1:
                        blwg = blwg.AMEX;
                        break;
                    case 2:
                        blwg = blwg.DISCOVER;
                        break;
                    case 3:
                        blwg = blwg.MASTERCARD;
                        break;
                    case 4:
                        blwg = blwg.VISA;
                        break;
                    case 5:
                        blwg = blwg.INTERAC;
                        break;
                    case 6:
                    case 9:
                    case 10:
                    default:
                        blwg = blwg.UNKNOWN_CARD_TYPE;
                        break;
                    case 7:
                        blwg = blwg.EFTPOS;
                        break;
                    case 8:
                        blwg = blwg.MAESTRO;
                        break;
                    case 11:
                        blwg = blwg.JCB;
                        break;
                    case 12:
                        blwg = blwg.ELO;
                        break;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmkr bmkr3 = (bmkr) da.f164949b;
                bmkr3.f129871d = blwg.f127943r;
                bmkr3.f129868a |= 4;
                Uri uri = cardInfoArr[i2].f108347h;
                if (uri != null) {
                    String uri2 = uri.toString();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmkr bmkr4 = (bmkr) da.f164949b;
                    uri2.getClass();
                    bmkr4.f129868a |= 8;
                    bmkr4.f129872e = uri2;
                }
                byte[] bArr = cardInfoArr[i2].f108354o;
                if (bArr != null) {
                    bxtx a3 = bxtx.m123261a(bArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmkr bmkr5 = (bmkr) da.f164949b;
                    a3.getClass();
                    bmkr5.f129868a |= 16;
                    bmkr5.f129873f = a3;
                }
                com.google.android.gms.tapandpay.firstparty.CardInfo cardInfo3 = cardInfoArr[i2];
                TokenStatus tokenStatus = cardInfo3.f108345f;
                if (tokenStatus != null) {
                    boolean z = tokenStatus.f108460c;
                    bmkr bmkr6 = (bmkr) da.f164949b;
                    int i6 = bmkr6.f129868a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bmkr6.f129868a = i6;
                    bmkr6.f129877j = z;
                    TokenReference tokenReference = tokenStatus.f108458a;
                    if (tokenReference != null) {
                        switch (tokenReference.f108457b) {
                            case 1:
                                i3 = 4;
                                break;
                            case 2:
                                i3 = 2;
                                break;
                            case 3:
                                i3 = 5;
                                break;
                            case 4:
                                i3 = 6;
                                break;
                            case 5:
                                i3 = 3;
                                break;
                            case 6:
                                i3 = 8;
                                break;
                            case 7:
                                i3 = 7;
                                break;
                            case 8:
                                i3 = 9;
                                break;
                            case 9:
                                i3 = 10;
                                break;
                            case 13:
                                i3 = 11;
                                break;
                            case 14:
                                i3 = 12;
                                break;
                            case 15:
                                i3 = 13;
                                break;
                        }
                        bmkr6.f129870c = i3 - 1;
                        bmkr6.f129868a = i6 | 2;
                    }
                } else {
                    bmkr bmkr7 = (bmkr) da.f164949b;
                    bmkr7.f129868a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bmkr7.f129877j = false;
                }
                String str = cardInfo3.f108343d;
                if (str != null) {
                    String charSequence = str.toString();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmkr bmkr8 = (bmkr) da.f164949b;
                    charSequence.getClass();
                    bmkr8.f129868a |= 64;
                    bmkr8.f129875h = charSequence;
                }
            }
            arrayList.add((bmkr) da.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    static JSONObject m80839a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONObject m80840a(String str, awru awru) {
        return m80841a("walletParameters", str, 1041, awru);
    }

    /* renamed from: a */
    static JSONObject m80841a(String str, String str2, int i, awru awru) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str2);
            } catch (JSONException e) {
                awru.mo52515a(String.format(Locale.US, str.concat(" must be a valid JSON String!"), new Object[0]), i);
                return null;
            }
        } else {
            awru.mo52515a(String.format(Locale.US, str.concat(" must be set!"), new Object[0]), i);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m80842a(JSONArray jSONArray, awru awru) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) m80828a(jSONArray, i, "allowedPaymentMethods", JSONObject.class, 1080, awru);
                Integer valueOf = Integer.valueOf(i);
                if ("CARD".equals((String) m80830a(jSONObject, "type", String.format("allowedPaymentMethods[%s]", valueOf), String.class, 1079, awru))) {
                    return (JSONObject) m80830a(jSONObject, "parameters", String.format("allowedPaymentMethods[%s]", valueOf), JSONObject.class, 1078, awru);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m80843a(bwgu bwgu, awru awru) {
        bxwc bxwc = bwgu.f159270d;
        int size = bxwc.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            bwgt bwgt = (bwgt) bxwc.get(i);
            if ("com.google.android.gms.wallet.api.enabled".equals(bwgt.f159263b) && "true".equals(bwgt.f159264c)) {
                z = true;
            }
        }
        if (!z) {
            awru.mo52515a("To use this API, you must add the following tag to your manifest: <meta-data android:name=\"com.google.android.gms.wallet.api.enabled\" android:value=\"true\" />", 1083);
        }
    }

    /* renamed from: a */
    static void m80844a(Cart cart, String str, awru awru) {
        if (cart == null) {
            awru.mo52515a(String.format(Locale.US, "Field %s is required", str), 1027);
            return;
        }
        m80806a(cart.f109776a, str.concat(".totalPrice"), awru);
        if (TextUtils.isEmpty(cart.f109777b)) {
            awru.mo52515a(String.format(Locale.US, "Field %s.currencyCode is required", str), 1026);
        }
    }

    /* renamed from: a */
    static void m80845a(WebPaymentDataRequest webPaymentDataRequest, awru awru) {
        if (webPaymentDataRequest == null) {
            awru.mo52515a(String.format(Locale.US, "webPaymentDataRequest must be set!", new Object[0]), 1040);
            return;
        }
        String str = webPaymentDataRequest.f109911c;
        if (str == null || str.isEmpty()) {
            awru.mo52515a(String.format(Locale.US, "walletParameters must be set!", new Object[0]), 1041);
        }
        String str2 = webPaymentDataRequest.f109910b;
        if (str2 == null || str2.isEmpty()) {
            awru.mo52515a(String.format(Locale.US, "merchantOrigin must be set!", new Object[0]), 1042);
        }
        m80844a(webPaymentDataRequest.f109909a, "cart", awru);
    }

    /* renamed from: a */
    public static void m80846a(String str, String str2) {
        Log.w("WalletMerchantError", String.format("Error in %s: %s", str, str2));
    }

    /* renamed from: a */
    public static boolean m80848a(PaymentDataRequest paymentDataRequest, awru awru) {
        if (paymentDataRequest == null) {
            return false;
        }
        String str = paymentDataRequest.f109893j;
        if (!TextUtils.isEmpty(str)) {
            return m80852a(m80841a("PaymentDataRequest", str, 1071, awru), awru);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m80849a(BuyFlowConfig buyFlowConfig) {
        Bundle bundle = buyFlowConfig.f110418b.f110408c;
        return bundle != null && bundle.getInt("com.google.android.gms.wallet.CLIENT") == 1;
    }

    /* renamed from: a */
    public static boolean m80850a(String str, int i, int i2) {
        String str2;
        for (String str3 : str.split(",", -1)) {
            String trim = str3.trim();
            if (!trim.isEmpty()) {
                if (trim.contains("-")) {
                    String[] b = m80861b("-", trim);
                    String str4 = b[0];
                    str2 = b[1];
                    trim = str4;
                } else {
                    str2 = trim;
                }
                int[] c = m80866c(".", trim);
                int[] c2 = m80866c(".", str2);
                if (!m80847a(i, i2, c2[0], c2[1]) && !m80847a(c[0], c[1], i, i2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m80851a(JSONObject jSONObject, int i, awru awru) {
        Boolean bool;
        if (i != 2 || (bool = (Boolean) m80829a(jSONObject, "existingPaymentMethodRequired", Boolean.class, 1082, awru)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m80852a(JSONObject jSONObject, awru awru) {
        return m80863c(jSONObject, awru) == 2 && "IN".equalsIgnoreCase((String) m80829a((JSONObject) m80829a(jSONObject, "transactionInfo", JSONObject.class, 1074, awru), "countryCode", String.class, 1075, awru));
    }

    /* renamed from: a */
    public static boolean m80853a(svq svq) {
        return ((Boolean) awie.f94420p.mo58455c()).booleanValue() || svq.mo26173a();
    }

    /* renamed from: a */
    public static boolean m80854a(svq svq, rfz rfz) {
        String str = (String) awie.f94413i.mo58455c();
        try {
            int intValue = ((Integer) awie.f94414j.mo58455c()).intValue();
            PackageInfo b = svq.mo26176b(str, 64);
            return intValue > 0 && intValue <= b.versionCode && rfz.mo24606a(b);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IbServiceUtilsError", String.format("Signature check failed for %s", str));
        }
    }
}
