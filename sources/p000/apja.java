package p000;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: apja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apja {

    /* renamed from: a */
    final int f84516a;

    /* renamed from: b */
    final int f84517b;

    /* renamed from: c */
    final ComponentName f84518c;

    /* renamed from: d */
    final apik f84519d;

    public apja(apik apik) {
        this.f84516a = apik.mo47305k();
        Integer num = apik.f84465g;
        this.f84517b = (num == null ? -1 : num).intValue();
        this.f84518c = apik.f84459a.mo47268f();
        apik.f84459a.mo47278o();
        this.f84519d = apik;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo47336a() {
        if (!this.f84519d.mo47297c()) {
            return new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setComponent(this.f84518c);
        }
        String concat = String.valueOf(this.f84518c.getClassName()).concat(".ACTION_TASK_READY");
        Intent a = aecj.m51628a(this.f84519d.f84464f, concat);
        return a == null ? new Intent(concat).setPackage(this.f84518c.getPackageName()) : a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apja) {
            apja apja = (apja) obj;
            return this.f84516a == apja.f84516a && this.f84517b == apja.f84517b && this.f84518c.equals(apja.f84518c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f84516a), this.f84518c});
    }
}
