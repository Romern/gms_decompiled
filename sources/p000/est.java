package p000;

import android.content.Context;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: est */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class est implements Comparable {

    /* renamed from: a */
    public GoogleSettingsItem f15644a;

    /* renamed from: b */
    public esu f15645b;

    public est(GoogleSettingsItem googleSettingsItem) {
        this.f15644a = googleSettingsItem;
    }

    /* renamed from: a */
    public final boolean mo10492a(Context context) {
        GoogleSettingsItem googleSettingsItem = this.f15644a;
        if (googleSettingsItem == null) {
            return this.f15645b.mo10494a(context);
        }
        return context.getPackageManager().resolveActivity(googleSettingsItem.f29956b, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        String str;
        String str2;
        int i2;
        est est = (est) obj;
        if (this == est) {
            return 0;
        }
        GoogleSettingsItem googleSettingsItem = this.f15644a;
        int i3 = Integer.MAX_VALUE;
        if (googleSettingsItem == null || (i = googleSettingsItem.f29959e) == -1) {
            i = Integer.MAX_VALUE;
        }
        GoogleSettingsItem googleSettingsItem2 = est.f15644a;
        if (!(googleSettingsItem2 == null || (i2 = googleSettingsItem2.f29959e) == -1)) {
            i3 = i2;
        }
        int compare = Integer.compare(i, i3);
        if (compare != 0) {
            return compare;
        }
        GoogleSettingsItem googleSettingsItem3 = this.f15644a;
        if (googleSettingsItem3 == null) {
            str = this.f15645b.f15646a;
        } else {
            str = googleSettingsItem3.f29958d;
        }
        GoogleSettingsItem googleSettingsItem4 = est.f15644a;
        if (googleSettingsItem4 == null) {
            str2 = est.f15645b.f15646a;
        } else {
            str2 = googleSettingsItem4.f29958d;
        }
        if (str != null && str2 != null) {
            return str.toString().compareToIgnoreCase(str2.toString());
        }
        if (str != str2) {
            return str != null ? 1 : -1;
        }
        return 0;
    }

    public est(esu esu) {
        this.f15645b = esu;
    }
}
