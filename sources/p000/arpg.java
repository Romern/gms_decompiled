package p000;

import android.os.Bundle;

/* renamed from: arpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arpg {

    /* renamed from: a */
    public int f88057a = -1;

    /* renamed from: b */
    public String f88058b;

    /* renamed from: c */
    public String f88059c;

    /* renamed from: d */
    public boolean f88060d;

    /* renamed from: e */
    public String f88061e;

    /* renamed from: f */
    public boolean f88062f = false;

    /* renamed from: g */
    private String f88063g;

    /* renamed from: h */
    private String f88064h;

    /* renamed from: i */
    private int f88065i = 0;

    /* renamed from: j */
    private int f88066j = 0;

    /* renamed from: k */
    private int f88067k = 0;

    /* renamed from: l */
    private boolean f88068l = false;

    /* renamed from: m */
    private boolean f88069m = false;

    /* renamed from: a */
    public final arph mo48731a() {
        Bundle bundle = new Bundle();
        bundle.putInt("iconResId", this.f88057a);
        bundle.putString("title", this.f88058b);
        bundle.putString("description", this.f88059c);
        bundle.putBoolean("description_html", this.f88060d);
        bundle.putString("body", null);
        bundle.putString("bodyHtml", this.f88061e);
        bundle.putString("primaryActionText", this.f88063g);
        bundle.putString("secondaryActionText", this.f88064h);
        bundle.putBoolean("magicWand", this.f88062f);
        bundle.putInt("primaryActionId", this.f88065i);
        bundle.putInt("secondaryActionId", this.f88066j);
        bundle.putInt("illustrationResId", this.f88067k);
        bundle.putBoolean("adjustIllustrationBounds", this.f88068l);
        bundle.putBoolean("progressBarEnabled", this.f88069m);
        arph arph = new arph();
        arph.setArguments(bundle);
        return arph;
    }

    /* renamed from: a */
    public final void mo48732a(int i, boolean z) {
        this.f88067k = i;
        this.f88068l = z;
    }

    /* renamed from: a */
    public final void mo48733a(String str, int i) {
        this.f88063g = str;
        this.f88065i = i;
    }

    /* renamed from: b */
    public final void mo48734b() {
        this.f88069m = true;
    }

    /* renamed from: b */
    public final void mo48735b(String str, int i) {
        this.f88064h = str;
        this.f88066j = i;
    }
}
