package p000;

import android.os.Bundle;
import android.support.wearable.complications.ComplicationData;

/* renamed from: aeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeo {

    /* renamed from: a */
    public final int f346a;

    /* renamed from: b */
    public final Bundle f347b = new Bundle();

    public aeo(int i) {
        this.f346a = i;
        if (i == 7 || i == 4) {
            ComplicationData.m1404b("IMAGE_STYLE", this.f346a);
            this.f347b.putInt("IMAGE_STYLE", 1);
        }
    }

    /* renamed from: a */
    public final ComplicationData mo539a() {
        String[] strArr = ComplicationData.f1367a[this.f346a];
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            if (!this.f347b.containsKey(str)) {
                int i2 = this.f346a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                sb.append("Field ");
                sb.append(str);
                sb.append(" is required for type ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            } else if (this.f347b.containsKey("ICON_BURN_IN_PROTECTION") && !this.f347b.containsKey("ICON")) {
                throw new IllegalStateException("Field ICON must be provided when field ICON_BURN_IN_PROTECTION is provided.");
            } else if (this.f347b.containsKey("SMALL_IMAGE_BURN_IN_PROTECTION") && !this.f347b.containsKey("SMALL_IMAGE")) {
                throw new IllegalStateException("Field SMALL_IMAGE must be provided when field SMALL_IMAGE_BURN_IN_PROTECTION is provided.");
            } else {
                i++;
            }
        }
        return new ComplicationData(this);
    }
}
