package p000;

import android.os.Build;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import java.lang.reflect.Field;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aboi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aboi {

    /* renamed from: a */
    public final TelephonyManager f57789a;

    public aboi(TelephonyManager telephonyManager) {
        this.f57789a = aboh.m47994a(telephonyManager);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static boss m47995a(ServiceState serviceState) {
        char c;
        Boolean bool = null;
        if (serviceState == null) {
            return null;
        }
        bxvd da = boss.f134650f.mo74144da();
        int state = serviceState.getState();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boss boss = (boss) da.f164949b;
        int i = 1;
        boss.f134652a |= 1;
        boss.f134653b = state;
        int i2 = Build.VERSION.SDK_INT;
        List b = bqcn.m112586b(serviceState.getCellBandwidths());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boss boss2 = (boss) da.f164949b;
        if (!boss2.f134654c.mo73666a()) {
            boss2.f134654c = GeneratedMessageLite.m124019a(boss2.f134654c);
        }
        bxsy.m123078a(b, boss2.f134654c);
        if (cele.f182890a.mo6606a().mo79263a()) {
            int i3 = Build.VERSION.SDK_INT;
            try {
                Field declaredField = ServiceState.class.getDeclaredField("mIsUsingCarrierAggregation");
                declaredField.setAccessible(true);
                bool = Boolean.valueOf(declaredField.getBoolean(serviceState));
            } catch (Exception e) {
                int i4 = eoa.f15378a;
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boss boss3 = (boss) da.f164949b;
                boss3.f134652a |= 2;
                boss3.f134655d = booleanValue;
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        String serviceState2 = serviceState.toString();
        Pattern compile = Pattern.compile("NetworkRegistrationInfo\\s*\\{\\s*domain=PS\\s*transportType=WWAN((?!nrState).)*nrState=([A-Z,_]+)[^\\}]*\\}");
        Pattern compile2 = Pattern.compile("NetworkRegistrationState\\s*\\{\\s*transportType=1\\s*domain=PS((?!nrStatus).)*nrStatus=([A-Z,_]+)[^\\}]*\\}");
        Matcher matcher = compile.matcher(serviceState2);
        Matcher matcher2 = compile2.matcher(serviceState2);
        String group = matcher.find() ? matcher.group(2) : !matcher2.find() ? "NONEXIST" : matcher2.group(2);
        switch (group.hashCode()) {
            case -2087582999:
                if (group.equals("CONNECTED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -812190629:
                if (group.equals("RESTRICTED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2402104:
                if (group.equals("NONE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 46267751:
                if (group.equals("NOT_RESTRICTED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = -1;
        } else if (c != 1) {
            i = c != 2 ? c != 3 ? -2 : 3 : 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boss boss4 = (boss) da.f164949b;
        boss4.f134652a |= 4;
        boss4.f134656e = i;
        return (boss) da.mo74062i();
    }

    /* renamed from: b */
    public final boolean mo32236b() {
        return this.f57789a.isConcurrentVoiceAndDataSupported();
    }

    /* renamed from: c */
    public final boolean mo32237c() {
        return this.f57789a.isDataEnabled();
    }

    /* renamed from: d */
    public final int mo32238d() {
        return this.f57789a.getVoiceNetworkType();
    }

    /* renamed from: a */
    public final boss mo32235a() {
        return m47995a(this.f57789a.getServiceState());
    }
}
