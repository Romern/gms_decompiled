package p000;

import android.content.ComponentName;
import android.text.TextUtils;
import com.google.android.gms.common.stats.WakeLockEvent;

/* renamed from: skq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skq {

    /* renamed from: a */
    public final int f44641a;

    /* renamed from: b */
    public final int f44642b;

    /* renamed from: c */
    public final boolean f44643c;

    public skq() {
        int i;
        int i2;
        boolean z = false;
        try {
            i2 = ((Integer) skl.f44626a.mo58455c()).intValue();
            i = ((Integer) ski.f44617a.mo58455c()).intValue();
        } catch (SecurityException e) {
            ComponentName componentName = skr.f44644a;
            i2 = 0;
            i = 0;
        }
        this.f44641a = i2;
        this.f44642b = i;
        ComponentName componentName2 = skr.f44644a;
        this.f44643c = (i == 0 && i2 == 0) ? z : true;
    }

    /* renamed from: a */
    public final boolean mo25697a(WakeLockEvent wakeLockEvent) {
        int i = wakeLockEvent.f30358c;
        if (i != 7) {
            if (i != 8) {
                if (i != 10) {
                    if (i != 11) {
                        return i == 16 && (this.f44641a & skr.f44645b) != 0 && TextUtils.isEmpty(wakeLockEvent.f30367l);
                    }
                }
            }
            return (this.f44641a & skr.f44647d) != 0 && TextUtils.isEmpty(wakeLockEvent.f30367l);
        }
        return (this.f44641a & skr.f44646c) != 0 && TextUtils.isEmpty(wakeLockEvent.f30367l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* renamed from: a */
    public final boolean mo25698a(String str) {
        char c;
        if (!this.f44643c) {
            return false;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1415196606) {
            if (hashCode == 383497604 && str.equals("wakelocks")) {
                c = 1;
                if (c == 0) {
                    int i = this.f44642b;
                    ComponentName componentName = skr.f44644a;
                    return i != 0;
                } else if (c == 1) {
                    int i2 = this.f44641a;
                    ComponentName componentName2 = skr.f44644a;
                    return i2 != 0;
                } else {
                    throw new IllegalArgumentException(str.concat(" is not a valid type"));
                }
            }
        } else if (str.equals("alarms")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    public skq(byte[] bArr) {
        this.f44641a = 0;
        this.f44642b = 0;
        ComponentName componentName = skr.f44644a;
        this.f44643c = false;
    }
}
