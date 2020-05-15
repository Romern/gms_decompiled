package p000;

import android.os.Bundle;

/* renamed from: aukp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukp {

    /* renamed from: a */
    public final Bundle f91987a = new Bundle();

    /* renamed from: a */
    public final aukr mo50616a() {
        boolean z;
        if (this.f91987a.getInt("image") != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Image resource id is missing.");
        bmxy.m108582a(this.f91987a.getString("title"), "Title string is missing.");
        bmxy.m108582a(this.f91987a.getString("content"), "Content string is missing.");
        aukr aukr = new aukr();
        aukr.setArguments(this.f91987a);
        return aukr;
    }

    /* renamed from: b */
    public final void mo50619b(String str) {
        this.f91987a.putString("content", str);
    }

    /* renamed from: c */
    public final void mo50620c(String str) {
        this.f91987a.putString("title", str);
    }

    /* renamed from: a */
    public final void mo50617a(int i) {
        this.f91987a.putInt("image", i);
    }

    /* renamed from: a */
    public final void mo50618a(String str) {
        this.f91987a.putString("btn_text", str);
    }
}
