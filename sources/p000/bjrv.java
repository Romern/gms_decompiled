package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: bjrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjrv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f123195a;

    /* renamed from: b */
    final /* synthetic */ int f123196b;

    /* renamed from: c */
    final /* synthetic */ bjry f123197c;

    public bjrv(bjry bjry, CharSequence charSequence, int i) {
        this.f123197c = bjry;
        this.f123195a = charSequence;
        this.f123196b = i;
    }

    public final void run() {
        if (this.f123195a == null) {
            String string = this.f123197c.f123200a.f123204a.getString(C0126R.string.default_error_msg);
            int i = this.f123196b;
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 12);
            sb.append(string);
            sb.append(" ");
            sb.append(i);
            sb.toString();
        }
        this.f123197c.f123200a.f123208e.mo52011a(!bjss.m104509a(this.f123196b) ? this.f123196b : 8);
    }
}
