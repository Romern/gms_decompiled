package p000;

import android.os.WorkSource;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.DetectedActivity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aefy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aefy {

    /* renamed from: a */
    public long f63344a = Long.MIN_VALUE;

    /* renamed from: b */
    public long f63345b = 0;

    /* renamed from: c */
    public boolean f63346c = true;

    /* renamed from: d */
    public WorkSource f63347d;

    /* renamed from: e */
    public String f63348e;

    /* renamed from: f */
    public boolean f63349f = false;

    /* renamed from: g */
    public String f63350g;

    /* renamed from: h */
    private Set f63351h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final ActivityRecognitionRequest mo34113a() {
        boolean z;
        int[] iArr;
        int i = 0;
        if (this.f63344a != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Must set intervalMillis.");
        long j = this.f63344a;
        boolean z2 = this.f63346c;
        WorkSource workSource = this.f63347d;
        String str = this.f63348e;
        Set set = this.f63351h;
        if (set == null || set.isEmpty()) {
            iArr = null;
        } else {
            Set<Integer> set2 = this.f63351h;
            int[] iArr2 = new int[set2.size()];
            for (Integer num : set2) {
                iArr2[i] = num.intValue();
                i++;
            }
            iArr = iArr2;
        }
        return new ActivityRecognitionRequest(j, z2, workSource, str, iArr, this.f63349f, this.f63350g, this.f63345b);
    }

    /* renamed from: b */
    public final void mo34116b(long j) {
        boolean z = j >= 0;
        StringBuilder sb = new StringBuilder(70);
        sb.append("Max report latency can't be negative, but it was: ");
        sb.append(j);
        sdo.m34975b(z, sb.toString());
        this.f63345b = j;
    }

    /* renamed from: a */
    public final void mo34114a(int i) {
        int[] iArr = DetectedActivity.f79317b;
        int length = iArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (i == iArr[i2]) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Requested activity ");
        sb.append(i);
        sb.append(" is not a valid non-default activity.");
        sdo.m34975b(z, sb.toString());
        if (this.f63351h == null) {
            this.f63351h = new HashSet();
        }
        this.f63351h.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo34115a(long j) {
        sdo.m34975b(j >= 0, "intervalMillis can't be negative.");
        this.f63344a = j;
    }
}
