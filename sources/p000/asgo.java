package p000;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: asgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgo extends asgr {

    /* renamed from: h */
    private static final Pattern f88922h = Pattern.compile("\\((.*)\\)$");

    /* renamed from: i */
    private static final Pattern f88923i = Pattern.compile("\\[(.*)]$");

    /* renamed from: j */
    private static final Pattern f88924j = Pattern.compile("\\{(.*)\\}$");

    /* renamed from: k */
    private static final Pattern f88925k = Pattern.compile("([^:][^=]*)=([^:^=]+)");

    /* renamed from: l */
    private static final Pattern f88926l = Pattern.compile("([^:][^=^{]*)[{]?([^=^{^}]*)[}]?=([^:^=]+)");

    /* renamed from: m */
    private static final bmyx f88927m = bmyx.m108640a(10);

    /* renamed from: n */
    private static final bmyx f88928n = bmyx.m108640a(':');

    /* renamed from: o */
    private static final bmyx f88929o = bmyx.m108640a('=');

    /* renamed from: p */
    private static final bmyx f88930p = bmyx.m108640a(',');

    /* renamed from: q */
    private static final bmyx f88931q = bmyx.m108640a('|');

    /* renamed from: r */
    private static final bmyx f88932r = bmyx.m108640a('&');

    /* renamed from: s */
    private static final bmyx f88933s = bmyx.m108640a(':');

    /* renamed from: t */
    private boolean f88934t = false;

    /* renamed from: u */
    private long f88935u = 1000;

    /* renamed from: v */
    private String f88936v;

    /* renamed from: w */
    private StringBuilder f88937w;

    public asgo() {
        super("Mediastats", "media.metrics", "MEDIA_STATS", false);
    }

    /* renamed from: a */
    private static final bybh m74051a(String str, String str2, int i) {
        bxvd da = bybh.f165496c.mo74144da();
        if ("error".equals(str2)) {
            long parseLong = Long.parseLong(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bybh bybh = (bybh) da.f164949b;
            bybh.f165498a = 2;
            bybh.f165499b = Long.valueOf(parseLong);
        } else if (str2.isEmpty()) {
            bxvd da2 = bybg.f165492c.mo74144da();
            if (i == 1) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bybg bybg = (bybg) da2.f164949b;
                str.getClass();
                bybg.f165494a = 1;
                bybg.f165495b = str;
            } else if (i != 2) {
                double parseDouble = Double.parseDouble(str);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bybg bybg2 = (bybg) da2.f164949b;
                bybg2.f165494a = 3;
                bybg2.f165495b = Double.valueOf(parseDouble);
            } else {
                long parseLong2 = Long.parseLong(str);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bybg bybg3 = (bybg) da2.f164949b;
                bybg3.f165494a = 2;
                bybg3.f165495b = Long.valueOf(parseLong2);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bybh bybh2 = (bybh) da.f164949b;
            bybg bybg4 = (bybg) da2.mo74062i();
            bybg4.getClass();
            bybh2.f165499b = bybg4;
            bybh2.f165498a = 1;
        } else {
            String valueOf = String.valueOf(str2);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid namePart ") : "Invalid namePart ".concat(valueOf));
        }
        return (bybh) da.mo74062i();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    private static final bybc m74055b(String str, bxvd bxvd) {
        char c;
        bxvd da = bybc.f165378aM.mo74144da();
        switch (str.hashCode()) {
            case -1947587429:
                if (str.equals("/drm/widevine/crypto_session/generic_decrypt/time")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -1702683776:
                if (str.equals("/drm/widevine/cdm_engine/get_usage_info/time")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1628684513:
                if (str.equals("/drm/widevine/oemcrypto/get_key_data/time")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1620898610:
                if (str.equals("/drm/widevine/crypto_session/open/time")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1611186791:
                if (str.equals("/drm/widevine/oemcrypto/load_keys/time")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1598153226:
                if (str.equals("/drm/widevine/oemcrypto/select_key/time")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1422448340:
                if (str.equals("/drm/widevine/cdm_engine/query_key_status/time")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1370456159:
                if (str.equals("/drm/widevine/oemcrypto/generic_decrypt/time")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1245833798:
                if (str.equals("/drm/widevine/oemcrypto/refresh_keys/time")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1049880535:
                if (str.equals("/drm/widevine/oemcrypto/decrypt_cenc/time")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1030748828:
                if (str.equals("/drm/widevine/oemcrypto/generate_signature/time")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1017544539:
                if (str.equals("/drm/widevine/oemcrypto/wrap_keybox/time")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -811197757:
                if (str.equals("/drm/widevine/crypto_session/generic_encrypt/time")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -730734919:
                if (str.equals("/drm/widevine/cdm_engine/handle_provisioning_response/time")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -425857162:
                if (str.equals("/drm/widevine/crypto_session/load_certificate_private_key/time")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case -291024563:
                if (str.equals("/drm/widevine/oemcrypto/rewrap_device_rsa_key/time")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -234066487:
                if (str.equals("/drm/widevine/oemcrypto/generic_encrypt/time")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -58944306:
                if (str.equals("/drm/widevine/cdm_session/renew_key/time")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case -46610547:
                if (str.equals("/drm/widevine/oemcrypto/generic_sign/time")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -12996734:
                if (str.equals("/drm/widevine/oemcrypto/initialize/time")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 134998671:
                if (str.equals("/drm/widevine/oemcrypto/rewrap_device_rsa_key_30/time")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 155634742:
                if (str.equals("/drm/widevine/cdm_engine/decrypt/time")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 243584211:
                if (str.equals("/drm/widevine/crypto_session/generic_sign/time")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 442974238:
                if (str.equals("/drm/widevine/oemcrypto/derive_keys_from_session_key/time")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 537304374:
                if (str.equals("/drm/widevine/oemcrypto/load_device_rsa_key/time")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 677972631:
                if (str.equals("/drm/widevine/crypto_session/generic_verify/time")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case 973684433:
                if (str.equals("/drm/widevine/oemcrypto/generic_verify/time")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 985428678:
                if (str.equals("/drm/widevine/oemcrypto/generate_derived_keys/time")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1086182044:
                if (str.equals("/drm/widevine/oemcrypto/copy_buffer/time")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1162162658:
                if (str.equals("/drm/widevine/oemcrypto/install_keybox/time")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1179386944:
                if (str.equals("/drm/widevine/crypto_session/update_usage_information/time")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1457135939:
                if (str.equals("/drm/widevine/oemcrypto/generate_rsa_signature/time")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1464269552:
                if (str.equals("/drm/widevine/cdm_engine/generate_key_request/time")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1691719810:
                if (str.equals("/drm/widevine/cdm_engine/add_key/time")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1758976879:
                if (str.equals("/drm/widevine/cdm_engine/get_provisioning_request/time")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1969925557:
                if (str.equals("/drm/widevine/cdm_engine/restore_key/time")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc = (bybc) da.f164949b;
                bybf bybf = (bybf) bxvd.mo74062i();
                bybf.getClass();
                bybc.f165444d = bybf;
                bybc.f165406a |= 1;
                break;
            case 1:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc2 = (bybc) da.f164949b;
                bybf bybf2 = (bybf) bxvd.mo74062i();
                bybf2.getClass();
                bybc2.f165447g = bybf2;
                bybc2.f165406a |= 8;
                break;
            case 2:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc3 = (bybc) da.f164949b;
                bybf bybf3 = (bybf) bxvd.mo74062i();
                bybf3.getClass();
                bybc3.f165449i = bybf3;
                bybc3.f165406a |= 32;
                break;
            case 3:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc4 = (bybc) da.f164949b;
                bybf bybf4 = (bybf) bxvd.mo74062i();
                bybf4.getClass();
                bybc4.f165450j = bybf4;
                bybc4.f165406a |= 64;
                break;
            case 4:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc5 = (bybc) da.f164949b;
                bybf bybf5 = (bybf) bxvd.mo74062i();
                bybf5.getClass();
                bybc5.f165451k = bybf5;
                bybc5.f165406a |= 128;
                break;
            case 5:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc6 = (bybc) da.f164949b;
                bybf bybf6 = (bybf) bxvd.mo74062i();
                bybf6.getClass();
                bybc6.f165452l = bybf6;
                bybc6.f165406a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                break;
            case 6:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc7 = (bybc) da.f164949b;
                bybf bybf7 = (bybf) bxvd.mo74062i();
                bybf7.getClass();
                bybc7.f165456p = bybf7;
                bybc7.f165406a |= 4096;
                break;
            case 7:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc8 = (bybc) da.f164949b;
                bybf bybf8 = (bybf) bxvd.mo74062i();
                bybf8.getClass();
                bybc8.f165460t = bybf8;
                bybc8.f165406a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                break;
            case 8:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc9 = (bybc) da.f164949b;
                bybf bybf9 = (bybf) bxvd.mo74062i();
                bybf9.getClass();
                bybc9.f165464x = bybf9;
                bybc9.f165406a |= 1048576;
                break;
            case 9:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc10 = (bybc) da.f164949b;
                bybf bybf10 = (bybf) bxvd.mo74062i();
                bybf10.getClass();
                bybc10.f165383D = bybf10;
                bybc10.f165406a |= 67108864;
                break;
            case 10:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc11 = (bybc) da.f164949b;
                bybf bybf11 = (bybf) bxvd.mo74062i();
                bybf11.getClass();
                bybc11.f165384E = bybf11;
                bybc11.f165406a |= 134217728;
                break;
            case 11:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc12 = (bybc) da.f164949b;
                bybf bybf12 = (bybf) bxvd.mo74062i();
                bybf12.getClass();
                bybc12.f165385F = bybf12;
                bybc12.f165406a |= 268435456;
                break;
            case 12:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc13 = (bybc) da.f164949b;
                bybf bybf13 = (bybf) bxvd.mo74062i();
                bybf13.getClass();
                bybc13.f165386G = bybf13;
                bybc13.f165406a |= 536870912;
                break;
            case 13:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc14 = (bybc) da.f164949b;
                bybf bybf14 = (bybf) bxvd.mo74062i();
                bybf14.getClass();
                bybc14.f165391L = bybf14;
                bybc14.f165442b |= 4;
                break;
            case 14:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc15 = (bybc) da.f164949b;
                bybf bybf15 = (bybf) bxvd.mo74062i();
                bybf15.getClass();
                bybc15.f165392M = bybf15;
                bybc15.f165442b |= 8;
                break;
            case 15:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc16 = (bybc) da.f164949b;
                bybf bybf16 = (bybf) bxvd.mo74062i();
                bybf16.getClass();
                bybc16.f165394O = bybf16;
                bybc16.f165442b |= 32;
                break;
            case 16:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc17 = (bybc) da.f164949b;
                bybf bybf17 = (bybf) bxvd.mo74062i();
                bybf17.getClass();
                bybc17.f165398S = bybf17;
                bybc17.f165442b |= 512;
                break;
            case 17:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc18 = (bybc) da.f164949b;
                bybf bybf18 = (bybf) bxvd.mo74062i();
                bybf18.getClass();
                bybc18.f165401V = bybf18;
                bybc18.f165442b |= 4096;
                break;
            case 18:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc19 = (bybc) da.f164949b;
                bybf bybf19 = (bybf) bxvd.mo74062i();
                bybf19.getClass();
                bybc19.f165404Y = bybf19;
                bybc19.f165442b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                break;
            case 19:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc20 = (bybc) da.f164949b;
                bybf bybf20 = (bybf) bxvd.mo74062i();
                bybf20.getClass();
                bybc20.f165420aa = bybf20;
                bybc20.f165442b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                break;
            case 20:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc21 = (bybc) da.f164949b;
                bybf bybf21 = (bybf) bxvd.mo74062i();
                bybf21.getClass();
                bybc21.f165422ac = bybf21;
                bybc21.f165442b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                break;
            case 21:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc22 = (bybc) da.f164949b;
                bybf bybf22 = (bybf) bxvd.mo74062i();
                bybf22.getClass();
                bybc22.f165423ad = bybf22;
                bybc22.f165442b |= 1048576;
                break;
            case 22:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc23 = (bybc) da.f164949b;
                bybf bybf23 = (bybf) bxvd.mo74062i();
                bybf23.getClass();
                bybc23.f165424ae = bybf23;
                bybc23.f165442b |= 2097152;
                break;
            case 23:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc24 = (bybc) da.f164949b;
                bybf bybf24 = (bybf) bxvd.mo74062i();
                bybf24.getClass();
                bybc24.f165425af = bybf24;
                bybc24.f165442b |= 4194304;
                break;
            case 24:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc25 = (bybc) da.f164949b;
                bybf bybf25 = (bybf) bxvd.mo74062i();
                bybf25.getClass();
                bybc25.f165426ak = bybf25;
                bybc25.f165442b |= 8388608;
                break;
            case 25:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc26 = (bybc) da.f164949b;
                bybf bybf26 = (bybf) bxvd.mo74062i();
                bybf26.getClass();
                bybc26.f165427al = bybf26;
                bybc26.f165442b |= 16777216;
                break;
            case 26:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc27 = (bybc) da.f164949b;
                bybf bybf27 = (bybf) bxvd.mo74062i();
                bybf27.getClass();
                bybc27.f165429an = bybf27;
                bybc27.f165442b |= 67108864;
                break;
            case 27:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc28 = (bybc) da.f164949b;
                bybf bybf28 = (bybf) bxvd.mo74062i();
                bybf28.getClass();
                bybc28.f165432aq = bybf28;
                bybc28.f165442b |= 536870912;
                break;
            case 28:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc29 = (bybc) da.f164949b;
                bybf bybf29 = (bybf) bxvd.mo74062i();
                bybf29.getClass();
                bybc29.f165433ar = bybf29;
                bybc29.f165442b |= JGCastService.FLAG_PRIVATE_DISPLAY;
                break;
            case 29:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc30 = (bybc) da.f164949b;
                bybf bybf30 = (bybf) bxvd.mo74062i();
                bybf30.getClass();
                bybc30.f165436au = bybf30;
                bybc30.f165443c |= 2;
                break;
            case 30:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc31 = (bybc) da.f164949b;
                bybf bybf31 = (bybf) bxvd.mo74062i();
                bybf31.getClass();
                bybc31.f165437av = bybf31;
                bybc31.f165443c |= 4;
                break;
            case 31:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc32 = (bybc) da.f164949b;
                bybf bybf32 = (bybf) bxvd.mo74062i();
                bybf32.getClass();
                bybc32.f165407aA = bybf32;
                bybc32.f165443c |= 128;
                break;
            case ' ':
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc33 = (bybc) da.f164949b;
                bybf bybf33 = (bybf) bxvd.mo74062i();
                bybf33.getClass();
                bybc33.f165410aD = bybf33;
                bybc33.f165443c |= 1024;
                break;
            case '!':
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc34 = (bybc) da.f164949b;
                bybf bybf34 = (bybf) bxvd.mo74062i();
                bybf34.getClass();
                bybc34.f165409aC = bybf34;
                bybc34.f165443c |= 512;
                break;
            case '\"':
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc35 = (bybc) da.f164949b;
                bybf bybf35 = (bybf) bxvd.mo74062i();
                bybf35.getClass();
                bybc35.f165412aF = bybf35;
                bybc35.f165443c |= 4096;
                break;
            case '#':
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybc bybc36 = (bybc) da.f164949b;
                bybf bybf36 = (bybf) bxvd.mo74062i();
                bybf36.getClass();
                bybc36.f165415aI = bybf36;
                bybc36.f165443c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                break;
            default:
                return null;
        }
        return (bybc) da.mo74062i();
    }

    /* renamed from: e */
    public static final bybk m74056e(String str) {
        List c = f88930p.mo66921b(5).mo66925c((CharSequence) str);
        if (c.size() != 5) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Illegal histogram attributes: ") : "Illegal histogram attributes: ".concat(valueOf));
        }
        float parseFloat = Float.parseFloat((String) c.get(1));
        if (parseFloat > 0.0f) {
            int parseInt = Integer.parseInt((String) c.get(2));
            if (parseInt <= 0 || parseInt > 50) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Illegal histogram bin number: ");
                sb.append(parseInt);
                throw new IllegalArgumentException(sb.toString());
            }
            float parseFloat2 = Float.parseFloat((String) c.get(3));
            ArrayList arrayList = new ArrayList(Collections.nCopies(parseInt + 2, 0));
            Matcher matcher = f88924j.matcher((CharSequence) c.get(4));
            if (!matcher.find()) {
                String valueOf2 = String.valueOf(str);
                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Illegal histogram attributes: ") : "Illegal histogram attributes: ".concat(valueOf2));
            }
            for (String str2 : f88930p.mo66918a((CharSequence) matcher.group(1))) {
                List c2 = f88931q.mo66925c((CharSequence) str2);
                if (c2.size() == 2) {
                    try {
                        int parseInt2 = Integer.parseInt((String) c2.get(0));
                        int parseInt3 = Integer.parseInt((String) c2.get(1));
                        if (parseInt2 >= -1 && parseInt2 <= parseInt && parseInt3 > 0) {
                            arrayList.set(parseInt2 + 1, Integer.valueOf(parseInt3));
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
            bxvd da = bybk.f165510f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bybk bybk = (bybk) da.f164949b;
            int i = 1 | bybk.f165512a;
            bybk.f165512a = i;
            bybk.f165513b = parseFloat;
            int i2 = i | 2;
            bybk.f165512a = i2;
            bybk.f165514c = parseInt;
            bybk.f165512a = i2 | 4;
            bybk.f165515d = parseFloat2;
            if (!bybk.f165516e.mo73666a()) {
                bybk.f165516e = bxvk.m124019a(bybk.f165516e);
            }
            bxsy.m123078a(arrayList, bybk.f165516e);
            return (bybk) da.mo74062i();
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Illegal histogram bin size: ");
        sb2.append(parseFloat);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: f */
    private final void m74057f(String str) {
        if (this.f88934t && ((long) (this.f88937w.length() + str.length())) < this.f88935u) {
            StringBuilder sb = this.f88937w;
            sb.append(str);
            sb.append(":");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: g */
    private static final bybe m74058g(String str) {
        bxvd da = bybe.f165475j.mo74144da();
        for (String str2 : f88932r.mo66918a((CharSequence) str)) {
            List c = f88933s.mo66925c((CharSequence) str2);
            if (c.size() == 2) {
                String str3 = (String) c.get(0);
                boolean z = true;
                String str4 = (String) c.get(1);
                try {
                    char c2 = 65535;
                    switch (str3.hashCode()) {
                        case -1867169789:
                            if (str3.equals("success")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -1400483146:
                            if (str3.equals("requested_security_level")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1266716235:
                            if (str3.equals("signing_algorithm")) {
                                c2 = 6;
                                break;
                            }
                            break;
                        case -1106363674:
                            if (str3.equals("length")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case -783714637:
                            if (str3.equals("encryption_algorithm")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case -430165023:
                            if (str3.equals("oemcrypto_error")) {
                                c2 = 7;
                                break;
                            }
                            break;
                        case -362150459:
                            if (str3.equals("security_level")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 96784904:
                            if (str3.equals("error")) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            int parseInt = Integer.parseInt(str4);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bybe bybe = (bybe) da.f164949b;
                            bybe.f165477a |= 1;
                            bybe.f165478b = parseInt;
                            continue;
                        case 1:
                            if (Integer.parseInt(str4) != 1) {
                                z = false;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bybe bybe2 = (bybe) da.f164949b;
                            bybe2.f165477a |= 2;
                            bybe2.f165479c = z;
                            continue;
                        case 2:
                            int parseInt2 = Integer.parseInt(str4);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bybe bybe3 = (bybe) da.f164949b;
                            bybe3.f165477a |= 4;
                            bybe3.f165480d = parseInt2;
                            continue;
                        case 3:
                            int parseInt3 = Integer.parseInt(str4);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bybe bybe4 = (bybe) da.f164949b;
                            bybe4.f165477a |= 8;
                            bybe4.f165481e = parseInt3;
                            continue;
                        case 4:
                            long parseLong = Long.parseLong(str4);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bybe bybe5 = (bybe) da.f164949b;
                            bybe5.f165477a |= 16;
                            bybe5.f165482f = parseLong;
                            continue;
                        case 5:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bybe bybe6 = (bybe) da.f164949b;
                            str4.getClass();
                            bybe6.f165477a |= 32;
                            bybe6.f165483g = str4;
                            continue;
                        case 6:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bybe bybe7 = (bybe) da.f164949b;
                            str4.getClass();
                            bybe7.f165477a |= 64;
                            bybe7.f165484h = str4;
                            continue;
                        case 7:
                            int parseInt4 = Integer.parseInt(str4);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bybe bybe8 = (bybe) da.f164949b;
                            bybe8.f165477a |= 128;
                            bybe8.f165485i = parseInt4;
                            continue;
                        default:
                            continue;
                    }
                } catch (IllegalArgumentException e) {
                }
            }
        }
        return (bybe) da.mo74062i();
    }

    /* renamed from: h */
    private static final Pair m74059h(String str) {
        List c = f88929o.mo66925c((CharSequence) str);
        if (c.size() == 2) {
            return Pair.create((String) c.get(0), (String) c.get(1));
        }
        return null;
    }

    /* renamed from: i */
    private static final bnic m74060i() {
        return bnic.m109494a("/drm/widevine/cdm_engine/add_key/time", "/drm/widevine/cdm_engine/decrypt/time", "/drm/widevine/cdm_engine/generate_key_request/time", "/drm/widevine/cdm_engine/get_provisioning_request/time", "/drm/widevine/cdm_engine/get_usage_info/time", "/drm/widevine/cdm_engine/handle_provisioning_response/time", "/drm/widevine/cdm_engine/query_key_status/time", "/drm/widevine/cdm_engine/restore_key/time", "/drm/widevine/cdm_session/renew_key/time", "/drm/widevine/crypto_session/generic_decrypt/time", "/drm/widevine/crypto_session/generic_encrypt/time", "/drm/widevine/crypto_session/generic_sign/time", "/drm/widevine/crypto_session/generic_verify/time", "/drm/widevine/crypto_session/load_certificate_private_key/time", "/drm/widevine/crypto_session/open/time", "/drm/widevine/crypto_session/update_usage_information/time", "/drm/widevine/oemcrypto/copy_buffer/time", "/drm/widevine/oemcrypto/decrypt_cenc/time", "/drm/widevine/oemcrypto/derive_keys_from_session_key/time", "/drm/widevine/oemcrypto/generate_derived_keys/time", "/drm/widevine/oemcrypto/generate_rsa_signature/time", "/drm/widevine/oemcrypto/generate_signature/time", "/drm/widevine/oemcrypto/generic_decrypt/time", "/drm/widevine/oemcrypto/generic_encrypt/time", "/drm/widevine/oemcrypto/generic_sign/time", "/drm/widevine/oemcrypto/generic_verify/time", "/drm/widevine/oemcrypto/get_key_data/time", "/drm/widevine/oemcrypto/initialize/time", "/drm/widevine/oemcrypto/install_keybox/time", "/drm/widevine/oemcrypto/load_device_rsa_key/time", "/drm/widevine/oemcrypto/load_keys/time", "/drm/widevine/oemcrypto/refresh_keys/time", "/drm/widevine/oemcrypto/rewrap_device_rsa_key_30/time", "/drm/widevine/oemcrypto/rewrap_device_rsa_key/time", "/drm/widevine/oemcrypto/select_key/time", "/drm/widevine/oemcrypto/wrap_keybox/time");
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgta.f187697a.mo6606a().mo84446e();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d */
    public final byat mo49151d(String str) {
        char c;
        char c2;
        bxvd da = byat.f165321l.mo74144da();
        for (String str2 : f88928n.mo66925c((CharSequence) str)) {
            Pair h = m74059h(str2);
            if (h != null) {
                String str3 = (String) h.second;
                try {
                    String str4 = (String) h.first;
                    int i = 5;
                    switch (str4.hashCode()) {
                        case -1903324807:
                            if (str4.equals("android.media.audiothread.framecount")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1496781117:
                            if (str4.equals("android.media.audiothread.activeMs")) {
                                c = 8;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1492325567:
                            if (str4.equals("android.media.audiothread.samplerate")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1061548717:
                            if (str4.equals("android.media.audiothread.warmupMs.hist")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -778309071:
                            if (str4.equals("android.media.audiothread.type")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -404860911:
                            if (str4.equals("android.media.audiothread.durationMs")) {
                                c = 9;
                                break;
                            }
                            c = 65535;
                            break;
                        case -386822775:
                            if (str4.equals("android.media.audiothread.underruns")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 689199507:
                            if (str4.equals("android.media.audiothread.overruns")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1205161411:
                            if (str4.equals("android.media.audiothread.latencyMs.hist")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1952397122:
                            if (str4.equals("android.media.audiothread.workMs.hist")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            switch (str3.hashCode()) {
                                case -1522623219:
                                    if (str3.equals("FASTMIXER")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 73372649:
                                    if (str3.equals("MIXER")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 433141802:
                                    if (str3.equals("UNKNOWN")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 821863242:
                                    if (str3.equals("FASTCAPTURE")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1270567718:
                                    if (str3.equals("CAPTURE")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                i = 1;
                            } else if (c2 == 1) {
                                i = 2;
                            } else if (c2 == 2) {
                                i = 3;
                            } else if (c2 == 3) {
                                i = 4;
                            } else if (c2 != 4) {
                                throw new IllegalArgumentException();
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat = (byat) da.f164949b;
                            byat.f165324b = i - 1;
                            byat.f165323a |= 1;
                            break;
                        case 1:
                            int parseInt = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat2 = (byat) da.f164949b;
                            byat2.f165323a |= 2;
                            byat2.f165325c = parseInt;
                            break;
                        case 2:
                            int parseInt2 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat3 = (byat) da.f164949b;
                            byat3.f165323a |= 4;
                            byat3.f165326d = parseInt2;
                            break;
                        case 3:
                            bybk e = m74056e(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat4 = (byat) da.f164949b;
                            e.getClass();
                            byat4.f165327e = e;
                            byat4.f165323a |= 8;
                            break;
                        case 4:
                            bybk e2 = m74056e(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat5 = (byat) da.f164949b;
                            e2.getClass();
                            byat5.f165328f = e2;
                            byat5.f165323a |= 16;
                            break;
                        case 5:
                            bybk e3 = m74056e(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat6 = (byat) da.f164949b;
                            e3.getClass();
                            byat6.f165329g = e3;
                            byat6.f165323a |= 32;
                            break;
                        case 6:
                            long parseLong = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat7 = (byat) da.f164949b;
                            byat7.f165323a |= 64;
                            byat7.f165330h = parseLong;
                            break;
                        case 7:
                            long parseLong2 = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat8 = (byat) da.f164949b;
                            byat8.f165323a |= 128;
                            byat8.f165331i = parseLong2;
                            break;
                        case 8:
                            long parseLong3 = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat9 = (byat) da.f164949b;
                            byat9.f165323a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            byat9.f165332j = parseLong3;
                            break;
                        case 9:
                            long parseLong4 = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byat byat10 = (byat) da.f164949b;
                            byat10.f165323a |= 512;
                            byat10.f165333k = parseLong4;
                            break;
                        default:
                            m74057f(str2);
                            break;
                    }
                } catch (IllegalArgumentException e4) {
                }
            }
        }
        return (byat) da.mo74062i();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public final byar mo49150c(String str) {
        bxvd da = byar.f165307l.mo74144da();
        for (String str2 : f88928n.mo66925c((CharSequence) str)) {
            Pair h = m74059h(str2);
            if (h != null) {
                String str3 = (String) h.second;
                try {
                    String str4 = (String) h.first;
                    char c = 65535;
                    switch (str4.hashCode()) {
                        case -1911472853:
                            if (str4.equals("android.media.audiorecord.source")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1445783058:
                            if (str4.equals("android.media.audiorecord.latency")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -964318566:
                            if (str4.equals("android.media.audiorecord.samplerate")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 123146090:
                            if (str4.equals("android.media.audiorecord.durationMs")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 285523870:
                            if (str4.equals("android.media.audiorecord.createdMs")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1006892256:
                            if (str4.equals("android.media.audiorecord.channels")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1285488227:
                            if (str4.equals("android.media.audiorecord.encoding")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1416415682:
                            if (str4.equals("android.media.audiorecord.errcode")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 1416511129:
                            if (str4.equals("android.media.audiorecord.errfunc")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 1668432222:
                            if (str4.equals("android.media.audiorecord.n")) {
                                c = 7;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar = (byar) da.f164949b;
                            str3.getClass();
                            byar.f165309a |= 1;
                            byar.f165310b = str3;
                            continue;
                        case 1:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar2 = (byar) da.f164949b;
                            str3.getClass();
                            byar2.f165309a |= 2;
                            byar2.f165311c = str3;
                            continue;
                        case 2:
                            int parseInt = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar3 = (byar) da.f164949b;
                            byar3.f165309a |= 4;
                            byar3.f165312d = parseInt;
                            continue;
                        case 3:
                            int parseInt2 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar4 = (byar) da.f164949b;
                            byar4.f165309a |= 8;
                            byar4.f165313e = parseInt2;
                            continue;
                        case 4:
                            int parseInt3 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar5 = (byar) da.f164949b;
                            byar5.f165309a |= 16;
                            byar5.f165314f = parseInt3;
                            continue;
                        case 5:
                            long parseLong = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar6 = (byar) da.f164949b;
                            byar6.f165309a |= 32;
                            byar6.f165315g = parseLong;
                            continue;
                        case 6:
                            long parseLong2 = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar7 = (byar) da.f164949b;
                            byar7.f165309a |= 64;
                            byar7.f165316h = parseLong2;
                            continue;
                        case 7:
                            int parseInt4 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar8 = (byar) da.f164949b;
                            byar8.f165309a |= 128;
                            byar8.f165317i = parseInt4;
                            continue;
                        case 8:
                            int parseInt5 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar9 = (byar) da.f164949b;
                            byar9.f165309a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            byar9.f165318j = parseInt5;
                            continue;
                        case 9:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byar byar10 = (byar) da.f164949b;
                            str3.getClass();
                            byar10.f165309a |= 512;
                            byar10.f165319k = str3;
                            continue;
                        default:
                            m74057f(str2);
                            continue;
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
        return (byar) da.mo74062i();
    }

    /* renamed from: a */
    private final void m74052a(bybm bybm, String str) {
        List c = f88928n.mo66921b(7).mo66925c((CharSequence) str);
        if (c.size() == 7) {
            bxvd da = bybo.f165527q.mo74144da();
            if (m74054a(da, (String) c.get(0), (String) c.get(6), (String) c.get(4))) {
                if (this.f88934t && this.f88937w.length() > 0) {
                    String sb = this.f88937w.toString();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bybo bybo = (bybo) da.f164949b;
                    sb.getClass();
                    bybo.f165529a |= 8;
                    bybo.f165533e = sb;
                }
                bybm.mo74343a(da);
            } else if (this.f88934t && ((long) this.f88936v.length()) <= this.f88935u) {
                String str2 = this.f88936v;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bybo bybo2 = (bybo) da.f164949b;
                str2.getClass();
                bybo2.f165529a |= 8;
                bybo2.f165533e = str2;
                bybm.mo74343a(da);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final void m74053a(String str, bxvd bxvd) {
        Pair pair;
        char c;
        bxvd bxvd2;
        int i;
        char c2;
        String str2 = str;
        bxvd bxvd3 = bxvd;
        Matcher matcher = f88925k.matcher(str2);
        if (matcher.find()) {
            int i2 = 2;
            if (matcher.groupCount() >= 2) {
                int i3 = 1;
                if ("serialized_metrics".equals(matcher.group(1))) {
                    String group = matcher.group(2);
                    bxvd da = bybr.f165586a.mo74144da();
                    try {
                        da.mo73633b(Base64.decode(group, 1));
                    } catch (bxwf | IllegalArgumentException e) {
                    }
                    bybr bybr = (bybr) da.mo74062i();
                    if (bxvd3.f164950c) {
                        bxvd.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bybo bybo = (bybo) bxvd3.f164949b;
                    bybo bybo2 = bybo.f165527q;
                    bybr.getClass();
                    bybo.f165541m = bybr;
                    bybo.f165529a |= 2048;
                    return;
                }
                byba byba = (byba) bybi.f165500b.mo74144da();
                HashMap hashMap = new HashMap();
                Matcher matcher2 = f88926l.matcher(str2);
                bnic a = bnic.m109494a("/drm/widevine/cdm_engine/close_session", "/drm/widevine/cdm_engine/find_session_for_key", "/drm/widevine/cdm_engine/open_key_set_session", "/drm/widevine/cdm_engine/open_session", "/drm/widevine/cdm_engine/release_all_usage_info", "/drm/widevine/cdm_engine/release_usage_info", "/drm/widevine/cdm_engine/remove_keys", "/drm/widevine/cdm_engine/unprovision", "/drm/widevine/cdm_session/restore_offline_session", "/drm/widevine/cdm_session/restore_usage_session", "/drm/widevine/crypto_session/delete_all_usage_reports", "/drm/widevine/crypto_session/delete_multiple_usage_information", "/drm/widevine/crypto_session/get_device_unique_id", "/drm/widevine/crypto_session/get_token", "/drm/widevine/oemcrypto/close_session", "/drm/widevine/oemcrypto/deactivate_usage_entry", "/drm/widevine/oemcrypto/delete_usage_entry", "/drm/widevine/oemcrypto/delete_usage_table", "/drm/widevine/oemcrypto/force_delete_usage_entry", "/drm/widevine/oemcrypto/generate_nonce", "/drm/widevine/oemcrypto/get_device_id", "/drm/widevine/oemcrypto/get_oem_public_certificate", "/drm/widevine/oemcrypto/get_random", "/drm/widevine/oemcrypto/report_usage", "/drm/widevine/oemcrypto/update_usage_table");
                bnic i4 = m74060i();
                int i5 = 3;
                bnic a2 = bnic.m109494a("/drm/widevine/cdm_engine/life_span", "/drm/widevine/cdm_engine/version", "/drm/widevine/cdm_engine/creation_time_millis", "/drm/widevine/cdm_session/life_span", "/drm/widevine/cdm_session/session_id", "/drm/widevine/crypto_session/security_level", "/drm/widevine/crypto_session/life_span", "/drm/widevine/crypto_session/system_id", "/drm/widevine/crypto_session/usage_information_support", "/drm/widevine/oemcrypto/api_version", "/drm/widevine/oemcrypto/current_hdcp_capability", "/drm/widevine/oemcrypto/initialization_mode", "/drm/widevine/oemcrypto/is_anti_rollback_hw_present", "/drm/widevine/oemcrypto/is_keybox_valid", "/drm/widevine/oemcrypto/l1_api_version", "/drm/widevine/oemcrypto/l1_min_api_version", "/drm/widevine/oemcrypto/max_hdcp_capability", "/drm/widevine/oemcrypto/max_number_of_sessions", "/drm/widevine/oemcrypto/number_of_open_sessions", "/drm/widevine/oemcrypto/provisioning_method", "/drm/widevine/oemcrypto/security_patch_level", "/drm/widevine/oemcrypto/supports_usage_table");
                while (matcher2.find()) {
                    String group2 = matcher2.group(i3);
                    String group3 = matcher2.group(i2);
                    String group4 = matcher2.group(i5);
                    if (!group2.isEmpty() && !group4.isEmpty()) {
                        int lastIndexOf = group2.lastIndexOf(47);
                        if (lastIndexOf == -1) {
                            pair = Pair.create(group2, "");
                        } else {
                            if (lastIndexOf != group2.length() - 1) {
                                String substring = group2.substring(lastIndexOf + 1);
                                if (substring.equals("min") || substring.equals("max") || substring.equals("mean") || substring.equals("variance") || substring.equals("count") || substring.equals("error")) {
                                    pair = Pair.create(group2.substring(0, lastIndexOf), substring);
                                }
                            }
                            pair = Pair.create(group2, "");
                        }
                        String str3 = (String) pair.first;
                        String str4 = (String) pair.second;
                        if (a.contains(str3)) {
                            bxvd da2 = bybc.f165378aM.mo74144da();
                            bxvd da3 = bybb.f165373d.mo74144da();
                            if (!group3.isEmpty()) {
                                bybe g = m74058g(group3);
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bybb bybb = (bybb) da3.f164949b;
                                g.getClass();
                                bybb.f165377c = g;
                                bybb.f165375a |= i2;
                            }
                            try {
                                long parseLong = Long.parseLong(group4);
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bybb bybb2 = (bybb) da3.f164949b;
                                bybb2.f165375a |= 1;
                                bybb2.f165376b = parseLong;
                            } catch (IllegalArgumentException e2) {
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bybb bybb3 = (bybb) da3.f164949b;
                                bybb3.f165375a |= 1;
                                bybb3.f165376b = 0;
                            }
                            switch (str3.hashCode()) {
                                case -1975417556:
                                    if (str3.equals("/drm/widevine/crypto_session/get_token")) {
                                        c = 13;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1950783396:
                                    if (str3.equals("/drm/widevine/oemcrypto/get_oem_public_certificate")) {
                                        c = 21;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1901597429:
                                    if (str3.equals("/drm/widevine/cdm_engine/open_key_set_session")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1808206707:
                                    if (str3.equals("/drm/widevine/crypto_session/get_device_unique_id")) {
                                        c = 12;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1631265143:
                                    if (str3.equals("/drm/widevine/cdm_engine/release_all_usage_info")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1481051307:
                                    if (str3.equals("/drm/widevine/cdm_engine/unprovision")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1296192056:
                                    if (str3.equals("/drm/widevine/cdm_engine/remove_keys")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1279182658:
                                    if (str3.equals("/drm/widevine/oemcrypto/force_delete_usage_entry")) {
                                        c = 18;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -643887855:
                                    if (str3.equals("/drm/widevine/oemcrypto/get_device_id")) {
                                        c = 20;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -333659530:
                                    if (str3.equals("/drm/widevine/oemcrypto/get_random")) {
                                        c = 22;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -198690560:
                                    if (str3.equals("/drm/widevine/oemcrypto/report_usage")) {
                                        c = 23;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -101284726:
                                    if (str3.equals("/drm/widevine/cdm_session/restore_offline_session")) {
                                        c = 8;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1324513:
                                    if (str3.equals("/drm/widevine/cdm_engine/find_session_for_key")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 30818824:
                                    if (str3.equals("/drm/widevine/cdm_engine/close_session")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 51583589:
                                    if (str3.equals("/drm/widevine/oemcrypto/close_session")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 180280399:
                                    if (str3.equals("/drm/widevine/oemcrypto/generate_nonce")) {
                                        c = 19;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 548547144:
                                    if (str3.equals("/drm/widevine/cdm_session/restore_usage_session")) {
                                        c = 9;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 577968746:
                                    if (str3.equals("/drm/widevine/oemcrypto/delete_usage_entry")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 591416774:
                                    if (str3.equals("/drm/widevine/oemcrypto/delete_usage_table")) {
                                        c = 17;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 681543827:
                                    if (str3.equals("/drm/widevine/crypto_session/delete_all_usage_reports")) {
                                        c = 10;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 876626916:
                                    if (str3.equals("/drm/widevine/oemcrypto/update_usage_table")) {
                                        c = 24;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1286981803:
                                    if (str3.equals("/drm/widevine/cdm_engine/release_usage_info")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1425633167:
                                    if (str3.equals("/drm/widevine/crypto_session/delete_multiple_usage_information")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1463220168:
                                    if (str3.equals("/drm/widevine/cdm_engine/open_session")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1994136243:
                                    if (str3.equals("/drm/widevine/oemcrypto/deactivate_usage_entry")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc = (bybc) da2.f164949b;
                                    bybb bybb4 = (bybb) da3.mo74062i();
                                    bybb4.getClass();
                                    bybc.f165445e = bybb4;
                                    i2 = 2;
                                    bybc.f165406a |= 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 1:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc2 = (bybc) da2.f164949b;
                                    bybb bybb5 = (bybb) da3.mo74062i();
                                    bybb5.getClass();
                                    bybc2.f165448h = bybb5;
                                    bybc2.f165406a |= 16;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 2:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc3 = (bybc) da2.f164949b;
                                    bybb bybb6 = (bybb) da3.mo74062i();
                                    bybb6.getClass();
                                    bybc3.f165454n = bybb6;
                                    bybc3.f165406a |= 1024;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 3:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc4 = (bybc) da2.f164949b;
                                    bybb bybb7 = (bybb) da3.mo74062i();
                                    bybb7.getClass();
                                    bybc4.f165455o = bybb7;
                                    bybc4.f165406a |= 2048;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 4:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc5 = (bybc) da2.f164949b;
                                    bybb bybb8 = (bybb) da3.mo74062i();
                                    bybb8.getClass();
                                    bybc5.f165457q = bybb8;
                                    bybc5.f165406a |= 8192;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 5:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc6 = (bybc) da2.f164949b;
                                    bybb bybb9 = (bybb) da3.mo74062i();
                                    bybb9.getClass();
                                    bybc6.f165458r = bybb9;
                                    bybc6.f165406a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 6:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc7 = (bybc) da2.f164949b;
                                    bybb bybb10 = (bybb) da3.mo74062i();
                                    bybb10.getClass();
                                    bybc7.f165459s = bybb10;
                                    bybc7.f165406a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 7:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc8 = (bybc) da2.f164949b;
                                    bybb bybb11 = (bybb) da3.mo74062i();
                                    bybb11.getClass();
                                    bybc8.f165461u = bybb11;
                                    bybc8.f165406a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 8:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc9 = (bybc) da2.f164949b;
                                    bybb bybb12 = (bybb) da3.mo74062i();
                                    bybb12.getClass();
                                    bybc9.f165465y = bybb12;
                                    bybc9.f165406a |= 2097152;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 9:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc10 = (bybc) da2.f164949b;
                                    bybb bybb13 = (bybb) da3.mo74062i();
                                    bybb13.getClass();
                                    bybc10.f165466z = bybb13;
                                    bybc10.f165406a |= 4194304;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 10:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc11 = (bybc) da2.f164949b;
                                    bybb bybb14 = (bybb) da3.mo74062i();
                                    bybb14.getClass();
                                    bybc11.f165381B = bybb14;
                                    bybc11.f165406a |= 16777216;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 11:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc12 = (bybc) da2.f164949b;
                                    bybb bybb15 = (bybb) da3.mo74062i();
                                    bybb15.getClass();
                                    bybc12.f165382C = bybb15;
                                    bybc12.f165406a |= 33554432;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 12:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc13 = (bybc) da2.f164949b;
                                    bybb bybb16 = (bybb) da3.mo74062i();
                                    bybb16.getClass();
                                    bybc13.f165387H = bybb16;
                                    bybc13.f165406a |= JGCastService.FLAG_PRIVATE_DISPLAY;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 13:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc14 = (bybc) da2.f164949b;
                                    bybb bybb17 = (bybb) da3.mo74062i();
                                    bybb17.getClass();
                                    bybc14.f165388I = bybb17;
                                    bybc14.f165406a |= Integer.MIN_VALUE;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 14:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc15 = (bybc) da2.f164949b;
                                    bybb bybb18 = (bybb) da3.mo74062i();
                                    bybb18.getClass();
                                    bybc15.f165397R = bybb18;
                                    bybc15.f165442b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 15:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc16 = (bybc) da2.f164949b;
                                    bybb bybb19 = (bybb) da3.mo74062i();
                                    bybb19.getClass();
                                    bybc16.f165400U = bybb19;
                                    bybc16.f165442b |= 2048;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 16:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc17 = (bybc) da2.f164949b;
                                    bybb bybb20 = (bybb) da3.mo74062i();
                                    bybb20.getClass();
                                    bybc17.f165402W = bybb20;
                                    bybc17.f165442b |= 8192;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 17:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc18 = (bybc) da2.f164949b;
                                    bybb bybb21 = (bybb) da3.mo74062i();
                                    bybb21.getClass();
                                    bybc18.f165403X = bybb21;
                                    bybc18.f165442b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 18:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc19 = (bybc) da2.f164949b;
                                    bybb bybb22 = (bybb) da3.mo74062i();
                                    bybb22.getClass();
                                    bybc19.f165405Z = bybb22;
                                    bybc19.f165442b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 19:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc20 = (bybc) da2.f164949b;
                                    bybb bybb23 = (bybb) da3.mo74062i();
                                    bybb23.getClass();
                                    bybc20.f165421ab = bybb23;
                                    bybc20.f165442b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 20:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc21 = (bybc) da2.f164949b;
                                    bybb bybb24 = (bybb) da3.mo74062i();
                                    bybb24.getClass();
                                    bybc21.f165428am = bybb24;
                                    bybc21.f165442b |= 33554432;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 21:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc22 = (bybc) da2.f164949b;
                                    bybb bybb25 = (bybb) da3.mo74062i();
                                    bybb25.getClass();
                                    bybc22.f165430ao = bybb25;
                                    bybc22.f165442b |= 134217728;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 22:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc23 = (bybc) da2.f164949b;
                                    bybb bybb26 = (bybb) da3.mo74062i();
                                    bybb26.getClass();
                                    bybc23.f165431ap = bybb26;
                                    bybc23.f165442b |= 268435456;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 23:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc24 = (bybc) da2.f164949b;
                                    bybb bybb27 = (bybb) da3.mo74062i();
                                    bybb27.getClass();
                                    bybc24.f165408aB = bybb27;
                                    bybc24.f165443c |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                case 24:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybc bybc25 = (bybc) da2.f164949b;
                                    bybb bybb28 = (bybb) da3.mo74062i();
                                    bybb28.getClass();
                                    bybc25.f165414aH = bybb28;
                                    bybc25.f165443c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    i2 = 2;
                                    byba.mo74341a(da2);
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                                default:
                                    i2 = 2;
                                    i3 = 1;
                                    i5 = 3;
                                    break;
                            }
                        } else if (i4.contains(str3)) {
                            Pair create = Pair.create(str3, group3);
                            Pair pair2 = (Pair) hashMap.get(create);
                            if (pair2 == null) {
                                bxvd da4 = bybf.f165486d.mo74144da();
                                if (!group3.isEmpty()) {
                                    bybe g2 = m74058g(group3);
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bybf bybf = (bybf) da4.f164949b;
                                    g2.getClass();
                                    bybf.f165490c = g2;
                                    bybf.f165488a |= i2;
                                }
                                bxvd2 = bybd.f165467g.mo74144da();
                                hashMap.put(create, Pair.create(da4, bxvd2));
                            } else {
                                bxvd2 = (bxvd) pair2.second;
                            }
                            try {
                                switch (str4.hashCode()) {
                                    case -1249575311:
                                        if (str4.equals("variance")) {
                                            i = 3;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 107876:
                                        if (str4.equals("max")) {
                                            i = 1;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 108114:
                                        if (str4.equals("min")) {
                                            i = 0;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 3347397:
                                        if (str4.equals("mean")) {
                                            i = 2;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 94851343:
                                        if (str4.equals("count")) {
                                            i = 4;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                if (i == 0) {
                                    i5 = 3;
                                    double parseDouble = Double.parseDouble(group4);
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    bybd bybd = (bybd) bxvd2.f164949b;
                                    bybd bybd2 = bybd.f165467g;
                                    bybd.f165469a |= 1;
                                    bybd.f165470b = parseDouble;
                                    i3 = 1;
                                } else if (i == 1) {
                                    i5 = 3;
                                    double parseDouble2 = Double.parseDouble(group4);
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    bybd bybd3 = (bybd) bxvd2.f164949b;
                                    bybd bybd4 = bybd.f165467g;
                                    bybd3.f165469a |= i2;
                                    bybd3.f165471c = parseDouble2;
                                    i3 = 1;
                                } else if (i != i2) {
                                    i5 = 3;
                                    if (i == 3) {
                                        double parseDouble3 = Double.parseDouble(group4);
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bybd bybd5 = (bybd) bxvd2.f164949b;
                                        bybd bybd6 = bybd.f165467g;
                                        bybd5.f165469a |= 8;
                                        bybd5.f165473e = parseDouble3;
                                        i3 = 1;
                                    } else if (i != 4) {
                                        i3 = 1;
                                    } else {
                                        try {
                                            long parseLong2 = Long.parseLong(group4);
                                            if (bxvd2.f164950c) {
                                                bxvd2.mo74035c();
                                                bxvd2.f164950c = false;
                                            }
                                            bybd bybd7 = (bybd) bxvd2.f164949b;
                                            bybd bybd8 = bybd.f165467g;
                                            bybd7.f165469a |= 16;
                                            bybd7.f165474f = parseLong2;
                                            i3 = 1;
                                        } catch (IllegalArgumentException e3) {
                                            i3 = 1;
                                        }
                                    }
                                } else {
                                    i5 = 3;
                                    double parseDouble4 = Double.parseDouble(group4);
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    bybd bybd9 = (bybd) bxvd2.f164949b;
                                    bybd bybd10 = bybd.f165467g;
                                    try {
                                        bybd9.f165469a |= 4;
                                        bybd9.f165472d = parseDouble4;
                                        i3 = 1;
                                    } catch (IllegalArgumentException e4) {
                                        i3 = 1;
                                    }
                                }
                            } catch (IllegalArgumentException e5) {
                                i5 = 3;
                                i3 = 1;
                            }
                        } else if (a2.contains(str3)) {
                            bxvd da5 = bybc.f165378aM.mo74144da();
                            try {
                                switch (str3.hashCode()) {
                                    case -2033241002:
                                        if (str3.equals("/drm/widevine/oemcrypto/number_of_open_sessions")) {
                                            c2 = 18;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1993781625:
                                        if (str3.equals("/drm/widevine/crypto_session/system_id")) {
                                            c2 = 7;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1712162924:
                                        if (str3.equals("/drm/widevine/oemcrypto/is_keybox_valid")) {
                                            c2 = 13;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1460367500:
                                        if (str3.equals("/drm/widevine/oemcrypto/is_anti_rollback_hw_present")) {
                                            c2 = 12;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1151453074:
                                        if (str3.equals("/drm/widevine/cdm_session/life_span")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -164786607:
                                        if (str3.equals("/drm/widevine/cdm_engine/version")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -154576279:
                                        if (str3.equals("/drm/widevine/oemcrypto/max_hdcp_capability")) {
                                            c2 = 16;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -150759046:
                                        if (str3.equals("/drm/widevine/crypto_session/usage_information_support")) {
                                            c2 = 8;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -61601949:
                                        if (str3.equals("/drm/widevine/oemcrypto/l1_api_version")) {
                                            c2 = 14;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -45635319:
                                        if (str3.equals("/drm/widevine/oemcrypto/provisioning_method")) {
                                            c2 = 19;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 80541300:
                                        if (str3.equals("/drm/widevine/oemcrypto/max_number_of_sessions")) {
                                            c2 = 17;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 352443465:
                                        if (str3.equals("/drm/widevine/oemcrypto/api_version")) {
                                            c2 = 9;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 630042232:
                                        if (str3.equals("/drm/widevine/oemcrypto/security_patch_level")) {
                                            c2 = 20;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 679628265:
                                        if (str3.equals("/drm/widevine/crypto_session/security_level")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 865873929:
                                        if (str3.equals("/drm/widevine/crypto_session/life_span")) {
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1218176447:
                                        if (str3.equals("/drm/widevine/cdm_engine/creation_time_millis")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1228332483:
                                        if (str3.equals("/drm/widevine/cdm_session/session_id")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1368014968:
                                        if (str3.equals("/drm/widevine/oemcrypto/initialization_mode")) {
                                            c2 = 11;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1604831478:
                                        if (str3.equals("/drm/widevine/oemcrypto/l1_min_api_version")) {
                                            c2 = 15;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1654781414:
                                        if (str3.equals("/drm/widevine/cdm_engine/life_span")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1795670687:
                                        if (str3.equals("/drm/widevine/oemcrypto/supports_usage_table")) {
                                            c2 = 21;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1953721726:
                                        if (str3.equals("/drm/widevine/oemcrypto/current_hdcp_capability")) {
                                            c2 = 10;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        bybh a3 = m74051a(group4, str4, 3);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc26 = (bybc) da5.f164949b;
                                        a3.getClass();
                                        bybc26.f165453m = a3;
                                        bybc26.f165406a |= 512;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 1:
                                        bybh a4 = m74051a(group4, str4, 1);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc27 = (bybc) da5.f164949b;
                                        a4.getClass();
                                        bybc27.f165462v = a4;
                                        bybc27.f165406a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 2:
                                        bybh a5 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc28 = (bybc) da5.f164949b;
                                        a5.getClass();
                                        bybc28.f165446f = a5;
                                        bybc28.f165406a |= 4;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 3:
                                        bybh a6 = m74051a(group4, str4, 3);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc29 = (bybc) da5.f164949b;
                                        a6.getClass();
                                        bybc29.f165463w = a6;
                                        bybc29.f165406a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 4:
                                        bybh a7 = m74051a(group4, str4, 1);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc30 = (bybc) da5.f164949b;
                                        a7.getClass();
                                        bybc30.f165389J = a7;
                                        bybc30.f165442b |= 1;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 5:
                                        bybh a8 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc31 = (bybc) da5.f164949b;
                                        a8.getClass();
                                        bybc31.f165380A = a8;
                                        bybc31.f165406a |= 8388608;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 6:
                                        bybh a9 = m74051a(group4, str4, 3);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc32 = (bybc) da5.f164949b;
                                        a9.getClass();
                                        bybc32.f165390K = a9;
                                        bybc32.f165442b |= i2;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 7:
                                        bybh a10 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc33 = (bybc) da5.f164949b;
                                        a10.getClass();
                                        bybc33.f165393N = a10;
                                        bybc33.f165442b |= 16;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 8:
                                        bybh a11 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc34 = (bybc) da5.f164949b;
                                        a11.getClass();
                                        bybc34.f165395P = a11;
                                        bybc34.f165442b |= 64;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 9:
                                        bybh a12 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc35 = (bybc) da5.f164949b;
                                        a12.getClass();
                                        bybc35.f165396Q = a12;
                                        bybc35.f165442b |= 128;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 10:
                                        bybh a13 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc36 = (bybc) da5.f164949b;
                                        a13.getClass();
                                        bybc36.f165399T = a13;
                                        bybc36.f165442b |= 1024;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 11:
                                        bybh a14 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc37 = (bybc) da5.f164949b;
                                        a14.getClass();
                                        bybc37.f165416aJ = a14;
                                        bybc37.f165443c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 12:
                                        bybh a15 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc38 = (bybc) da5.f164949b;
                                        a15.getClass();
                                        bybc38.f165434as = a15;
                                        bybc38.f165442b |= Integer.MIN_VALUE;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 13:
                                        bybh a16 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc39 = (bybc) da5.f164949b;
                                        a16.getClass();
                                        bybc39.f165435at = a16;
                                        bybc39.f165443c |= 1;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 14:
                                        bybh a17 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc40 = (bybc) da5.f164949b;
                                        a17.getClass();
                                        bybc40.f165417aK = a17;
                                        bybc40.f165443c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 15:
                                        bybh a18 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc41 = (bybc) da5.f164949b;
                                        a18.getClass();
                                        bybc41.f165418aL = a18;
                                        bybc41.f165443c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 16:
                                        bybh a19 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc42 = (bybc) da5.f164949b;
                                        a19.getClass();
                                        bybc42.f165438aw = a19;
                                        bybc42.f165443c |= 8;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 17:
                                        bybh a20 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc43 = (bybc) da5.f164949b;
                                        a20.getClass();
                                        bybc43.f165439ax = a20;
                                        bybc43.f165443c |= 16;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 18:
                                        bybh a21 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc44 = (bybc) da5.f164949b;
                                        a21.getClass();
                                        bybc44.f165440ay = a21;
                                        bybc44.f165443c |= 32;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 19:
                                        bybh a22 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc45 = (bybc) da5.f164949b;
                                        a22.getClass();
                                        bybc45.f165441az = a22;
                                        bybc45.f165443c |= 64;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 20:
                                        bybh a23 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc46 = (bybc) da5.f164949b;
                                        a23.getClass();
                                        bybc46.f165411aE = a23;
                                        bybc46.f165443c |= 2048;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    case 21:
                                        bybh a24 = m74051a(group4, str4, i2);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybc bybc47 = (bybc) da5.f164949b;
                                        a24.getClass();
                                        bybc47.f165413aG = a24;
                                        bybc47.f165443c |= 8192;
                                        byba.mo74341a(da5);
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                    default:
                                        i3 = 1;
                                        i5 = 3;
                                        break;
                                }
                            } catch (IllegalArgumentException e6) {
                                i3 = 1;
                                i5 = 3;
                            }
                        } else {
                            i3 = 1;
                            i5 = 3;
                        }
                    } else {
                        i3 = 1;
                        i5 = 3;
                    }
                }
                for (Pair pair3 : hashMap.keySet()) {
                    Pair pair4 = (Pair) hashMap.get(pair3);
                    bxvd bxvd4 = (bxvd) pair4.first;
                    bxvd bxvd5 = (bxvd) pair4.second;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bybf bybf2 = (bybf) bxvd4.f164949b;
                    bybd bybd11 = (bybd) bxvd5.mo74062i();
                    bybf bybf3 = bybf.f165486d;
                    bybd11.getClass();
                    bybf2.f165489b = bybd11;
                    bybf2.f165488a |= 1;
                    bybc b = m74055b((String) pair3.first, bxvd4);
                    if (b != null) {
                        if (byba.f164950c) {
                            byba.mo74035c();
                            byba.f164950c = false;
                        }
                        bybi bybi = (bybi) byba.f164949b;
                        b.getClass();
                        bybi.mo74342c();
                        bybi.f165502a.add(b);
                    }
                }
                bybi bybi2 = (bybi) byba.mo74062i();
                if (bxvd3.f164950c) {
                    bxvd.mo74035c();
                    bxvd3.f164950c = false;
                }
                bybo bybo3 = (bybo) bxvd3.f164949b;
                bybo bybo4 = bybo.f165527q;
                bybi2.getClass();
                bybo3.f165535g = bybi2;
                bybo3.f165529a |= 32;
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public final byaq mo49149b(String str) {
        char c;
        bxvd da = byaq.f165296j.mo74144da();
        for (String str2 : f88928n.mo66925c((CharSequence) str)) {
            Pair h = m74059h(str2);
            if (h != null) {
                String str3 = (String) h.second;
                try {
                    String str4 = (String) h.first;
                    switch (str4.hashCode()) {
                        case -344255373:
                            if (str4.equals("android.media.audiopolicy.active.pkg")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -344252277:
                            if (str4.equals("android.media.audiopolicy.active.src")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -247416563:
                            if (str4.equals("android.media.audiopolicy.rqst.pkg")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -247413467:
                            if (str4.equals("android.media.audiopolicy.rqst.src")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 373817687:
                            if (str4.equals("android.media.audiopolicy.rqst.session")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1400414035:
                            if (str4.equals("android.media.audiopolicy.reason")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1442897153:
                            if (str4.equals("android.media.audiopolicy.status")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1803172285:
                            if (str4.equals("android.media.audiopolicy.active.session")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            for (String str5 : f88930p.mo66918a((CharSequence) str3)) {
                                try {
                                    byan a = byan.m124604a(str5.toUpperCase(Locale.ROOT));
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    byaq byaq = (byaq) da.f164949b;
                                    a.getClass();
                                    if (!byaq.f165299b.mo73666a()) {
                                        byaq.f165299b = bxvk.m124019a(byaq.f165299b);
                                    }
                                    byaq.f165299b.mo74153d(a.f165294f);
                                } catch (IllegalArgumentException e) {
                                }
                            }
                            continue;
                        case 1:
                            int parseInt = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaq byaq2 = (byaq) da.f164949b;
                            byaq2.f165298a |= 1;
                            byaq2.f165300c = parseInt;
                            continue;
                        case 2:
                            int a2 = byap.m124608a(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaq byaq3 = (byaq) da.f164949b;
                            byaq3.f165301d = a2 - 1;
                            byaq3.f165298a |= 2;
                            continue;
                        case 3:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaq byaq4 = (byaq) da.f164949b;
                            str3.getClass();
                            byaq4.f165298a |= 4;
                            byaq4.f165302e = str3;
                            continue;
                        case 4:
                            int parseInt2 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaq byaq5 = (byaq) da.f164949b;
                            byaq5.f165298a |= 8;
                            byaq5.f165303f = parseInt2;
                            continue;
                        case 5:
                            int a3 = byap.m124608a(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaq byaq6 = (byaq) da.f164949b;
                            byaq6.f165304g = a3 - 1;
                            byaq6.f165298a |= 16;
                            continue;
                        case 6:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaq byaq7 = (byaq) da.f164949b;
                            str3.getClass();
                            byaq7.f165298a |= 32;
                            byaq7.f165305h = str3;
                            continue;
                        case 7:
                            int parseInt3 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaq byaq8 = (byaq) da.f164949b;
                            byaq8.f165298a |= 64;
                            byaq8.f165306i = parseInt3;
                            continue;
                        default:
                            m74057f(str2);
                            continue;
                    }
                } catch (IllegalArgumentException e2) {
                }
            }
        }
        return (byaq) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        calx calx;
        String group;
        int indexOf;
        calu calu = (calu) calx.f175201v.mo74144da();
        if (calu.f164950c) {
            calu.mo74035c();
            calu.f164950c = false;
        }
        calx calx2 = (calx) calu.f164949b;
        int i = calx2.f175203a | 1;
        calx2.f175203a = i;
        calx2.f175206d = j;
        calx2.f175203a = i | 2;
        calx2.f175207e = j2;
        try {
            String str = new String(srz.m36178b(inputStream), asem.f88778e);
            try {
                this.f88934t = cgun.f187778a.mo6606a().mo84511b();
                this.f88935u = cgun.f187778a.mo6606a().mo84510a();
                bybm bybm = (bybm) bybn.f165523b.mo74144da();
                for (String str2 : f88927m.mo66918a((CharSequence) str)) {
                    String trim = str2.trim();
                    this.f88936v = trim;
                    this.f88937w = new StringBuilder();
                    Matcher matcher = f88922h.matcher(trim);
                    if (!matcher.find()) {
                        Matcher matcher2 = f88923i.matcher(trim);
                        if (matcher2.find() && (indexOf = (group = matcher2.group(1)).indexOf(":")) != -1) {
                            try {
                                int parseInt = Integer.parseInt(group.substring(0, indexOf));
                                if (parseInt == 0) {
                                    int i2 = indexOf + 1;
                                    if (i2 < group.length()) {
                                        m74052a(bybm, group.substring(i2));
                                    }
                                } else if (parseInt == 1) {
                                    List c = f88928n.mo66921b(11).mo66925c((CharSequence) group);
                                    if (c.size() == 11) {
                                        bxvd da = bybo.f165527q.mo74144da();
                                        String str3 = (String) c.get(4);
                                        String str4 = (String) c.get(5);
                                        if (m74054a(da, (String) c.get(1), (String) c.get(10), (String) c.get(8))) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bybo bybo = (bybo) da.f164949b;
                                            str3.getClass();
                                            int i3 = bybo.f165529a | 2;
                                            bybo.f165529a = i3;
                                            bybo.f165531c = str3;
                                            str4.getClass();
                                            bybo.f165529a = i3 | 4;
                                            bybo.f165532d = str4;
                                            if (this.f88934t && this.f88937w.length() > 0) {
                                                String sb = this.f88937w.toString();
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bybo bybo2 = (bybo) da.f164949b;
                                                sb.getClass();
                                                bybo2.f165529a |= 8;
                                                bybo2.f165533e = sb;
                                            }
                                            bybm.mo74343a(da);
                                        } else if (this.f88934t && ((long) this.f88936v.length()) <= this.f88935u) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bybo bybo3 = (bybo) da.f164949b;
                                            str3.getClass();
                                            int i4 = bybo3.f165529a | 2;
                                            bybo3.f165529a = i4;
                                            bybo3.f165531c = str3;
                                            str4.getClass();
                                            int i5 = i4 | 4;
                                            bybo3.f165529a = i5;
                                            bybo3.f165532d = str4;
                                            String str5 = this.f88936v;
                                            str5.getClass();
                                            bybo3.f165529a = i5 | 8;
                                            bybo3.f165533e = str5;
                                            bybm.mo74343a(da);
                                        }
                                    }
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                    } else {
                        m74052a(bybm, matcher.group(1));
                    }
                }
                this.f88936v = null;
                this.f88937w = null;
                bybn bybn = (bybn) bybm.mo74062i();
                if (calu.f164950c) {
                    calu.mo74035c();
                    calu.f164950c = false;
                }
                calx calx3 = (calx) calu.f164949b;
                bybn.getClass();
                calx3.f175205c = bybn;
                calx3.f175204b = 30;
                calx = (calx) calu.mo74062i();
                srz.m36171a((Closeable) inputStream);
                return calx;
            } catch (IOException e2) {
                Log.w(this.f88779a, "Failed to read dumpsys output file.");
                calx calx4 = (calx) calu.mo74062i();
                srz.m36171a((Closeable) inputStream);
                return calx4;
            } catch (Throwable th) {
                srz.m36171a((Closeable) inputStream);
                throw th;
            }
        } catch (OutOfMemoryError e3) {
            String valueOf = String.valueOf(this.f88784f);
            qxq.mo24383c(valueOf.length() == 0 ? new String("DumpsysOutOfMemory") : "DumpsysOutOfMemory".concat(valueOf)).mo24359a();
            qxq.mo24388e();
            calx = (calx) calu.mo74062i();
        }
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        int i = Build.VERSION.SDK_INT;
        return cgsf.f187633a.mo6606a().mo84391g();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x09ab A[Catch:{ NumberFormatException -> 0x0a01 }] */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x09e7 A[Catch:{ NumberFormatException -> 0x0a01 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136  */
    /* renamed from: a */
    private final boolean m74054a(bxvd bxvd, String str, String str2, String str3) {
        char c;
        boolean z;
        char c2;
        char c3;
        boolean z2;
        char c4;
        char c5;
        boolean z3;
        char c6;
        bxvd bxvd2 = bxvd;
        String str4 = str;
        String str5 = str2;
        switch (str.hashCode()) {
            case -1791428760:
                if (str4.equals("nuplayer")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -900768965:
                if (str4.equals("mediadrm")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case -799233858:
                if (str4.equals("recorder")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -252850652:
                if (str4.equals("extractor")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 94834710:
                if (str4.equals("codec")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1267763336:
                if (str4.equals("audiopolicy")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1315524519:
                if (str4.equals("audiorecord")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1375990112:
                if (str4.equals("audiothread")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1568688949:
                if (str4.equals("audiotrack")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2098224273:
                if (str4.equals("drm.vendor.Google.WidevineCDM")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                byaw a = mo49148a(str5);
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo = (bybo) bxvd2.f164949b;
                bybo bybo2 = bybo.f165527q;
                a.getClass();
                bybo.f165534f = a;
                bybo.f165529a |= 16;
                z = true;
                break;
            case 1:
                bxvd da = bybj.f165504e.mo74144da();
                for (String str6 : f88928n.mo66925c((CharSequence) str5)) {
                    Pair h = m74059h(str6);
                    if (h != null) {
                        String str7 = (String) h.second;
                        try {
                            String str8 = (String) h.first;
                            int hashCode = str8.hashCode();
                            if (hashCode != -981783224) {
                                if (hashCode != -370304295) {
                                    if (hashCode == -370263772 && str8.equals("android.media.mediaextractor.ntrk")) {
                                        c2 = 2;
                                        if (c2 != 0) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bybj bybj = (bybj) da.f164949b;
                                            str7.getClass();
                                            bybj.f165506a |= 1;
                                            bybj.f165507b = str7;
                                        } else if (c2 == 1) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bybj bybj2 = (bybj) da.f164949b;
                                            str7.getClass();
                                            bybj2.f165506a |= 2;
                                            bybj2.f165508c = str7;
                                        } else if (c2 != 2) {
                                            m74057f(str6);
                                        } else {
                                            int parseInt = Integer.parseInt(str7);
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bybj bybj3 = (bybj) da.f164949b;
                                            bybj3.f165506a |= 4;
                                            bybj3.f165509d = parseInt;
                                        }
                                    }
                                } else if (str8.equals("android.media.mediaextractor.mime")) {
                                    c2 = 0;
                                    if (c2 != 0) {
                                    }
                                }
                            } else if (str8.equals("android.media.mediaextractor.fmt")) {
                                c2 = 1;
                                if (c2 != 0) {
                                }
                            }
                            c2 = 65535;
                            if (c2 != 0) {
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                }
                bybj bybj4 = (bybj) da.mo74062i();
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo3 = (bybo) bxvd2.f164949b;
                bybo bybo4 = bybo.f165527q;
                bybj4.getClass();
                bybo3.f165536h = bybj4;
                bybo3.f165529a |= 64;
                z = true;
                break;
            case 2:
                bxvd da2 = bybp.f165546q.mo74144da();
                for (String str9 : f88928n.mo66925c((CharSequence) str5)) {
                    Pair h2 = m74059h(str9);
                    if (h2 != null) {
                        String str10 = (String) h2.second;
                        try {
                            String str11 = (String) h2.first;
                            switch (str11.hashCode()) {
                                case -1699666690:
                                    if (str11.equals("android.media.mediaplayer.errstate")) {
                                        c3 = 14;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1429227508:
                                    if (str11.equals("android.media.mediaplayer.audio.codec")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1329554898:
                                    if (str11.equals("android.media.mediaplayer.rebuffers")) {
                                        c3 = 12;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1010945908:
                                    if (str11.equals("android.media.mediaplayer.durationMs")) {
                                        c3 = 8;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -969979241:
                                    if (str11.equals("android.media.mediaplayer.dataSource")) {
                                        c3 = 10;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -945195314:
                                    if (str11.equals("android.media.mediaplayer.dropped")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -854428317:
                                    if (str11.equals("android.media.mediaplayer.rebufferingMs")) {
                                        c3 = 11;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -828612367:
                                    if (str11.equals("android.media.mediaplayer.video.codec")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -738548354:
                                    if (str11.equals("android.media.mediaplayer.audio.mime")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -582814301:
                                    if (str11.equals("android.media.mediaplayer.rebufferExit")) {
                                        c3 = 13;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 389204985:
                                    if (str11.equals("android.media.mediaplayer.video.mime")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 454273108:
                                    if (str11.equals("android.media.mediaplayer.width")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 719084504:
                                    if (str11.equals("android.media.mediaplayer.frames")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 764569689:
                                    if (str11.equals("android.media.mediaplayer.height")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 830147074:
                                    if (str11.equals("android.media.mediaplayer.playingMs")) {
                                        c3 = 9;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp = (bybp) da2.f164949b;
                                    str10.getClass();
                                    bybp.f165548a |= 1;
                                    bybp.f165549b = str10;
                                    continue;
                                case 1:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp2 = (bybp) da2.f164949b;
                                    str10.getClass();
                                    bybp2.f165548a |= 2;
                                    bybp2.f165550c = str10;
                                    continue;
                                case 2:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp3 = (bybp) da2.f164949b;
                                    str10.getClass();
                                    bybp3.f165548a |= 4;
                                    bybp3.f165551d = str10;
                                    continue;
                                case 3:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp4 = (bybp) da2.f164949b;
                                    str10.getClass();
                                    bybp4.f165548a |= 8;
                                    bybp4.f165552e = str10;
                                    continue;
                                case 4:
                                    int parseInt2 = Integer.parseInt(str10);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp5 = (bybp) da2.f164949b;
                                    bybp5.f165548a |= 16;
                                    bybp5.f165553f = parseInt2;
                                    continue;
                                case 5:
                                    int parseInt3 = Integer.parseInt(str10);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp6 = (bybp) da2.f164949b;
                                    bybp6.f165548a |= 32;
                                    bybp6.f165554g = parseInt3;
                                    continue;
                                case 6:
                                    long parseLong = Long.parseLong(str10);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp7 = (bybp) da2.f164949b;
                                    bybp7.f165548a |= 64;
                                    bybp7.f165555h = parseLong;
                                    continue;
                                case 7:
                                    long parseLong2 = Long.parseLong(str10);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp8 = (bybp) da2.f164949b;
                                    bybp8.f165548a |= 128;
                                    bybp8.f165556i = parseLong2;
                                    continue;
                                case 8:
                                    long parseLong3 = Long.parseLong(str10);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp9 = (bybp) da2.f164949b;
                                    bybp9.f165548a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    bybp9.f165557j = parseLong3;
                                    continue;
                                case 9:
                                    long parseLong4 = Long.parseLong(str10);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp10 = (bybp) da2.f164949b;
                                    bybp10.f165548a |= 512;
                                    bybp10.f165558k = parseLong4;
                                    continue;
                                case 10:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp11 = (bybp) da2.f164949b;
                                    str10.getClass();
                                    bybp11.f165548a |= 1024;
                                    bybp11.f165559l = str10;
                                    continue;
                                case 11:
                                    long parseLong5 = Long.parseLong(str10);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp12 = (bybp) da2.f164949b;
                                    bybp12.f165548a |= 2048;
                                    bybp12.f165560m = parseLong5;
                                    continue;
                                case 12:
                                    int parseInt4 = Integer.parseInt(str10);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp13 = (bybp) da2.f164949b;
                                    bybp13.f165548a |= 4096;
                                    bybp13.f165561n = parseInt4;
                                    continue;
                                case 13:
                                    if (Integer.parseInt(str10) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp14 = (bybp) da2.f164949b;
                                    bybp14.f165548a |= 8192;
                                    bybp14.f165562o = z2;
                                    continue;
                                case 14:
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bybp bybp15 = (bybp) da2.f164949b;
                                    str10.getClass();
                                    bybp15.f165548a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    bybp15.f165563p = str10;
                                    continue;
                                default:
                                    m74057f(str9);
                                    continue;
                            }
                        } catch (NumberFormatException e2) {
                        }
                    }
                }
                bybp bybp16 = (bybp) da2.mo74062i();
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo5 = (bybo) bxvd2.f164949b;
                bybo bybo6 = bybo.f165527q;
                bybp16.getClass();
                bybo5.f165537i = bybp16;
                bybo5.f165529a |= 128;
                z = true;
                break;
            case 3:
                bxvd da3 = bybq.f165564u.mo74144da();
                for (String str12 : f88928n.mo66925c((CharSequence) str5)) {
                    Pair h3 = m74059h(str12);
                    if (h3 != null) {
                        String str13 = (String) h3.second;
                        try {
                            String str14 = (String) h3.first;
                            switch (str14.hashCode()) {
                                case -1448341909:
                                    if (str14.equals("android.media.mediarecorder.movie-timescale")) {
                                        c4 = 8;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1251147119:
                                    if (str14.equals("android.media.mediarecorder.video-encoder-profile")) {
                                        c4 = 11;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -900836463:
                                    if (str14.equals("android.media.mediarecorder.audio-timescale")) {
                                        c4 = 9;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -845599124:
                                    if (str14.equals("android.media.mediarecorder.video-encoder-level")) {
                                        c4 = 12;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -814952356:
                                    if (str14.equals("android.media.mediarecorder.audio-channels")) {
                                        c4 = 5;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -749237657:
                                    if (str14.equals("android.media.mediarecorder.video-iframe-interval")) {
                                        c4 = 7;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -590809035:
                                    if (str14.equals("android.media.mediarecorder.frame-rate")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -451867295:
                                    if (str14.equals("android.media.mediarecorder.audio-bitrate")) {
                                        c4 = 6;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -416896356:
                                    if (str14.equals("android.media.mediarecorder.height")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -362373197:
                                    if (str14.equals("android.media.mediarecorder.rotation")) {
                                        c4 = 15;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 256195981:
                                    if (str14.equals("android.media.mediarecorder.capture-fps")) {
                                        c4 = 14;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 589666070:
                                    if (str14.equals("android.media.mediarecorder.audio-samplerate")) {
                                        c4 = 4;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 951623593:
                                    if (str14.equals("android.media.mediarecorder.pausedMs")) {
                                        c4 = 17;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 957454671:
                                    if (str14.equals("android.media.mediarecorder.durationMs")) {
                                        c4 = 16;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1213665542:
                                    if (str14.equals("android.media.mediarecorder.video-bitrate")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1385992625:
                                    if (str14.equals("android.media.mediarecorder.width")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1948385782:
                                    if (str14.equals("android.media.mediarecorder.video-timescale")) {
                                        c4 = 10;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 2030519632:
                                    if (str14.equals("android.media.mediarecorder.capture-fpsenable")) {
                                        c4 = 13;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 2047649878:
                                    if (str14.equals("android.media.mediarecorder.NPauses")) {
                                        c4 = 18;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            switch (c4) {
                                case 0:
                                    int parseInt5 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq = (bybq) da3.f164949b;
                                    bybq.f165566a |= 1;
                                    bybq.f165567b = parseInt5;
                                    continue;
                                case 1:
                                    int parseInt6 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq2 = (bybq) da3.f164949b;
                                    bybq2.f165566a |= 2;
                                    bybq2.f165568c = parseInt6;
                                    continue;
                                case 2:
                                    int parseInt7 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq3 = (bybq) da3.f164949b;
                                    bybq3.f165566a |= 4;
                                    bybq3.f165569d = parseInt7;
                                    continue;
                                case 3:
                                    int parseInt8 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq4 = (bybq) da3.f164949b;
                                    bybq4.f165566a |= 8;
                                    bybq4.f165570e = parseInt8;
                                    continue;
                                case 4:
                                    int parseInt9 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq5 = (bybq) da3.f164949b;
                                    bybq5.f165566a |= 16;
                                    bybq5.f165571f = parseInt9;
                                    continue;
                                case 5:
                                    int parseInt10 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq6 = (bybq) da3.f164949b;
                                    bybq6.f165566a |= 32;
                                    bybq6.f165572g = parseInt10;
                                    continue;
                                case 6:
                                    int parseInt11 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq7 = (bybq) da3.f164949b;
                                    bybq7.f165566a |= 64;
                                    bybq7.f165573h = parseInt11;
                                    continue;
                                case 7:
                                    int parseInt12 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq8 = (bybq) da3.f164949b;
                                    bybq8.f165566a |= 128;
                                    bybq8.f165574i = parseInt12;
                                    continue;
                                case 8:
                                    int parseInt13 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq9 = (bybq) da3.f164949b;
                                    bybq9.f165566a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    bybq9.f165575j = parseInt13;
                                    continue;
                                case 9:
                                    int parseInt14 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq10 = (bybq) da3.f164949b;
                                    bybq10.f165566a |= 512;
                                    bybq10.f165576k = parseInt14;
                                    continue;
                                case 10:
                                    int parseInt15 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq11 = (bybq) da3.f164949b;
                                    bybq11.f165566a |= 1024;
                                    bybq11.f165577l = parseInt15;
                                    continue;
                                case 11:
                                    int parseInt16 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq12 = (bybq) da3.f164949b;
                                    bybq12.f165566a |= 2048;
                                    bybq12.f165578m = parseInt16;
                                    continue;
                                case 12:
                                    int parseInt17 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq13 = (bybq) da3.f164949b;
                                    bybq13.f165566a |= 4096;
                                    bybq13.f165579n = parseInt17;
                                    continue;
                                case 13:
                                    int parseInt18 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq14 = (bybq) da3.f164949b;
                                    bybq14.f165566a |= 8192;
                                    bybq14.f165580o = parseInt18;
                                    continue;
                                case 14:
                                    double parseDouble = Double.parseDouble(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq15 = (bybq) da3.f164949b;
                                    bybq15.f165566a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    bybq15.f165581p = parseDouble;
                                    continue;
                                case 15:
                                    int parseInt19 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq16 = (bybq) da3.f164949b;
                                    bybq16.f165566a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                    bybq16.f165582q = parseInt19;
                                    continue;
                                case 16:
                                    long parseLong6 = Long.parseLong(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq17 = (bybq) da3.f164949b;
                                    bybq17.f165566a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                    bybq17.f165583r = parseLong6;
                                    continue;
                                case 17:
                                    long parseLong7 = Long.parseLong(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq18 = (bybq) da3.f164949b;
                                    bybq18.f165566a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    bybq18.f165584s = parseLong7;
                                    continue;
                                case 18:
                                    int parseInt20 = Integer.parseInt(str13);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bybq bybq19 = (bybq) da3.f164949b;
                                    bybq19.f165566a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                    bybq19.f165585t = parseInt20;
                                    continue;
                                default:
                                    m74057f(str12);
                                    continue;
                            }
                        } catch (NumberFormatException e3) {
                        }
                    }
                }
                bybq bybq20 = (bybq) da3.mo74062i();
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo7 = (bybo) bxvd2.f164949b;
                bybo bybo8 = bybo.f165527q;
                bybq20.getClass();
                bybo7.f165538j = bybq20;
                bybo7.f165529a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                z = true;
                break;
            case 4:
                byaq b = mo49149b(str5);
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo9 = (bybo) bxvd2.f164949b;
                bybo bybo10 = bybo.f165527q;
                b.getClass();
                bybo9.f165539k = b;
                bybo9.f165529a |= 512;
                z = true;
                break;
            case 5:
                bxvd da4 = byau.f165334i.mo74144da();
                for (String str15 : f88928n.mo66925c((CharSequence) str5)) {
                    Pair h4 = m74059h(str15);
                    if (h4 != null) {
                        String str16 = (String) h4.second;
                        try {
                            String str17 = (String) h4.first;
                            switch (str17.hashCode()) {
                                case -2075188854:
                                    if (str17.equals("android.media.audiotrack.streamtype")) {
                                        c5 = 0;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -1905691159:
                                    if (str17.equals("android.media.audiotrack.underrunframes")) {
                                        c5 = 5;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -1278500449:
                                    if (str17.equals("android.media.audiotrack.channelmask")) {
                                        c5 = 4;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -737353638:
                                    if (str17.equals("android.media.audiotrack.samplerate")) {
                                        c5 = 3;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 1721495050:
                                    if (str17.equals("android.media.audiotrack.type")) {
                                        c5 = 1;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 1815016852:
                                    if (str17.equals("android.media.audiotrack.glitch.startup")) {
                                        c5 = 6;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 1827469521:
                                    if (str17.equals("android.media.audiotrack.usage")) {
                                        c5 = 2;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                default:
                                    c5 = 65535;
                                    break;
                            }
                            switch (c5) {
                                case 0:
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    byau byau = (byau) da4.f164949b;
                                    str16.getClass();
                                    byau.f165336a |= 1;
                                    byau.f165337b = str16;
                                    continue;
                                case 1:
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    byau byau2 = (byau) da4.f164949b;
                                    str16.getClass();
                                    byau2.f165336a |= 2;
                                    byau2.f165338c = str16;
                                    continue;
                                case 2:
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    byau byau3 = (byau) da4.f164949b;
                                    str16.getClass();
                                    byau3.f165336a |= 4;
                                    byau3.f165339d = str16;
                                    continue;
                                case 3:
                                    int parseInt21 = Integer.parseInt(str16);
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    byau byau4 = (byau) da4.f164949b;
                                    byau4.f165336a |= 8;
                                    byau4.f165340e = parseInt21;
                                    continue;
                                case 4:
                                    long parseLong8 = Long.parseLong(str16);
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    byau byau5 = (byau) da4.f164949b;
                                    byau5.f165336a |= 16;
                                    byau5.f165341f = parseLong8;
                                    continue;
                                case 5:
                                    int parseInt22 = Integer.parseInt(str16);
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    byau byau6 = (byau) da4.f164949b;
                                    byau6.f165336a |= 32;
                                    byau6.f165342g = parseInt22;
                                    continue;
                                case 6:
                                    if (Integer.parseInt(str16) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    byau byau7 = (byau) da4.f164949b;
                                    byau7.f165336a |= 64;
                                    byau7.f165343h = z3;
                                    continue;
                                default:
                                    m74057f(str15);
                                    continue;
                            }
                        } catch (NumberFormatException e4) {
                        }
                    }
                }
                byau byau8 = (byau) da4.mo74062i();
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo11 = (bybo) bxvd2.f164949b;
                bybo bybo12 = bybo.f165527q;
                byau8.getClass();
                bybo11.f165542n = byau8;
                bybo11.f165529a |= 4096;
                z = true;
                break;
            case 6:
                byar c7 = mo49150c(str5);
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo13 = (bybo) bxvd2.f164949b;
                bybo bybo14 = bybo.f165527q;
                c7.getClass();
                bybo13.f165543o = c7;
                bybo13.f165529a |= 8192;
                z = true;
                break;
            case 7:
                byat d = mo49151d(str5);
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo15 = (bybo) bxvd2.f164949b;
                bybo bybo16 = bybo.f165527q;
                d.getClass();
                bybo15.f165544p = d;
                bybo15.f165529a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                z = true;
                break;
            case 8:
                bxvd da5 = bybl.f165517e.mo74144da();
                for (String str18 : f88928n.mo66925c((CharSequence) str5)) {
                    List c8 = f88929o.mo66925c((CharSequence) str18);
                    if (c8.size() == 2) {
                        String str19 = (String) c8.get(0);
                        int hashCode2 = str19.hashCode();
                        if (hashCode2 != -1724546052) {
                            if (hashCode2 != -820075192) {
                                if (hashCode2 == -790095608 && str19.equals("serialized_metrics")) {
                                    c6 = 0;
                                    if (c6 != 0) {
                                        bxvd da6 = byaz.f165370a.mo74144da();
                                        try {
                                            da6.mo73633b(Base64.decode((String) c8.get(1), 1));
                                        } catch (bxwf | IllegalArgumentException e5) {
                                        }
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybl bybl = (bybl) da5.f164949b;
                                        byaz byaz = (byaz) da6.mo74062i();
                                        byaz.getClass();
                                        bybl.f165522d = byaz;
                                        bybl.f165519a |= 4;
                                    } else if (c6 == 1) {
                                        String str20 = (String) c8.get(1);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybl bybl2 = (bybl) da5.f164949b;
                                        str20.getClass();
                                        bybl2.f165519a |= 1;
                                        bybl2.f165520b = str20;
                                    } else if (c6 == 2) {
                                        String str21 = (String) c8.get(1);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bybl bybl3 = (bybl) da5.f164949b;
                                        str21.getClass();
                                        bybl3.f165519a |= 2;
                                        bybl3.f165521c = str21;
                                    }
                                }
                            } else if (str19.equals("vendor")) {
                                c6 = 1;
                                if (c6 != 0) {
                                }
                            }
                        } else if (str19.equals("description")) {
                            c6 = 2;
                            if (c6 != 0) {
                            }
                        }
                        c6 = 65535;
                        if (c6 != 0) {
                        }
                    }
                }
                bybl bybl4 = (bybl) da5.mo74062i();
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bybo bybo17 = (bybo) bxvd2.f164949b;
                bybo bybo18 = bybo.f165527q;
                bybl4.getClass();
                bybo17.f165540l = bybl4;
                bybo17.f165529a |= 1024;
                z = true;
                break;
            case 9:
                m74053a(str5, bxvd2);
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z && !this.f88934t) {
            return false;
        }
        try {
            long parseLong9 = Long.parseLong(str3.substring(0, str3.length() - 9)) * 1000;
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            bybo bybo19 = (bybo) bxvd2.f164949b;
            bybo bybo20 = bybo.f165527q;
            bybo19.f165529a |= 1;
            bybo19.f165530b = parseLong9;
        } catch (IndexOutOfBoundsException | NumberFormatException e6) {
        }
        return z;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final byaw mo49148a(String str) {
        bxvd da = byaw.f165345u.mo74144da();
        for (String str2 : f88928n.mo66925c((CharSequence) str)) {
            Pair h = m74059h(str2);
            if (h != null) {
                String str3 = (String) h.second;
                try {
                    String str4 = (String) h.first;
                    boolean z = true;
                    char c = 65535;
                    switch (str4.hashCode()) {
                        case -1514507257:
                            if (str4.equals("android.media.mediacodec.latency.unknown")) {
                                c = 13;
                                break;
                            }
                            break;
                        case -1155421937:
                            if (str4.equals("android.media.mediacodec.latency.avg")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -1155411039:
                            if (str4.equals("android.media.mediacodec.latency.max")) {
                                c = 9;
                                break;
                            }
                            break;
                        case -1155410801:
                            if (str4.equals("android.media.mediacodec.latency.min")) {
                                c = 10;
                                break;
                            }
                            break;
                        case -980431018:
                            if (str4.equals("android.media.mediacodec.profile")) {
                                c = 14;
                                break;
                            }
                            break;
                        case -580900360:
                            if (str4.equals("android.media.mediacodec.maxheight")) {
                                c = 17;
                                break;
                            }
                            break;
                        case -123828825:
                            if (str4.equals("android.media.mediacodec.mime")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -123823338:
                            if (str4.equals("android.media.mediacodec.mode")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 447208707:
                            if (str4.equals("android.media.mediacodec.codec")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 455239793:
                            if (str4.equals("android.media.mediacodec.level")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 465500851:
                            if (str4.equals("android.media.mediacodec.width")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 633372529:
                            if (str4.equals("android.media.mediacodec.rotation")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1103607509:
                            if (str4.equals("android.media.mediacodec.maxwidth")) {
                                c = 16;
                                break;
                            }
                            break;
                        case 1112629722:
                            if (str4.equals("android.media.mediacodec.height")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1427385386:
                            if (str4.equals("android.media.mediacodec.secure")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1893767659:
                            if (str4.equals("android.media.mediacodec.latency.n")) {
                                c = 12;
                                break;
                            }
                            break;
                        case 2016594633:
                            if (str4.equals("android.media.mediacodec.encoder")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 2073543231:
                            if (str4.equals("android.media.mediacodec.errstate")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 2144617087:
                            if (str4.equals("android.media.mediacodec.errcode")) {
                                c = 18;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw = (byaw) da.f164949b;
                            str3.getClass();
                            byaw.f165347a |= 1;
                            byaw.f165348b = str3;
                            continue;
                        case 1:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw2 = (byaw) da.f164949b;
                            str3.getClass();
                            byaw2.f165347a |= 2;
                            byaw2.f165349c = str3;
                            continue;
                        case 2:
                            if (!"audio".equals(str3)) {
                                if ("video".equals(str3)) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    byaw byaw3 = (byaw) da.f164949b;
                                    byaw3.f165350d = 2;
                                    byaw3.f165347a |= 4;
                                    break;
                                } else {
                                    continue;
                                }
                            } else {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                byaw byaw4 = (byaw) da.f164949b;
                                byaw4.f165350d = 1;
                                byaw4.f165347a |= 4;
                                break;
                            }
                        case 3:
                            if (Integer.parseInt(str3) == 0) {
                                z = false;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw5 = (byaw) da.f164949b;
                            byaw5.f165347a |= 8;
                            byaw5.f165351e = z;
                            continue;
                        case 4:
                            int parseInt = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw6 = (byaw) da.f164949b;
                            byaw6.f165347a |= 16;
                            byaw6.f165352f = parseInt;
                            continue;
                        case 5:
                            int parseInt2 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw7 = (byaw) da.f164949b;
                            byaw7.f165347a |= 32;
                            byaw7.f165353g = parseInt2;
                            continue;
                        case 6:
                            int parseInt3 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw8 = (byaw) da.f164949b;
                            byaw8.f165347a |= 64;
                            byaw8.f165354h = parseInt3;
                            continue;
                        case 7:
                            if (Integer.parseInt(str3) == 0) {
                                z = false;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw9 = (byaw) da.f164949b;
                            byaw9.f165347a |= 128;
                            byaw9.f165355i = z;
                            continue;
                        case 8:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw10 = (byaw) da.f164949b;
                            str3.getClass();
                            byaw10.f165347a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            byaw10.f165356j = str3;
                            continue;
                        case 9:
                            long parseLong = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw11 = (byaw) da.f164949b;
                            byaw11.f165347a |= 512;
                            byaw11.f165357k = parseLong;
                            continue;
                        case 10:
                            long parseLong2 = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw12 = (byaw) da.f164949b;
                            byaw12.f165347a |= 1024;
                            byaw12.f165358l = parseLong2;
                            continue;
                        case 11:
                            long parseLong3 = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw13 = (byaw) da.f164949b;
                            byaw13.f165347a |= 2048;
                            byaw13.f165359m = parseLong3;
                            continue;
                        case 12:
                            long parseLong4 = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw14 = (byaw) da.f164949b;
                            byaw14.f165347a |= 4096;
                            byaw14.f165360n = parseLong4;
                            continue;
                        case 13:
                            long parseLong5 = Long.parseLong(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw15 = (byaw) da.f164949b;
                            byaw15.f165347a |= 8192;
                            byaw15.f165361o = parseLong5;
                            continue;
                        case 14:
                            int parseInt4 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw16 = (byaw) da.f164949b;
                            byaw16.f165347a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            byaw16.f165362p = parseInt4;
                            continue;
                        case 15:
                            int parseInt5 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw17 = (byaw) da.f164949b;
                            byaw17.f165347a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                            byaw17.f165363q = parseInt5;
                            continue;
                        case 16:
                            int parseInt6 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw18 = (byaw) da.f164949b;
                            byaw18.f165347a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                            byaw18.f165364r = parseInt6;
                            continue;
                        case 17:
                            int parseInt7 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw19 = (byaw) da.f164949b;
                            byaw19.f165347a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                            byaw19.f165365s = parseInt7;
                            continue;
                        case 18:
                            int parseInt8 = Integer.parseInt(str3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byaw byaw20 = (byaw) da.f164949b;
                            byaw20.f165347a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            byaw20.f165366t = parseInt8;
                            continue;
                        default:
                            m74057f(str2);
                            continue;
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
        return (byaw) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        return new String[]{"-since", String.valueOf(j)};
    }
}
