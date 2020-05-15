package p000;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: azxy */
public final /* synthetic */ class azxy implements C1270pi {

    /* renamed from: a */
    private final ViewGroup.MarginLayoutParams f100185a;

    /* renamed from: b */
    private final int f100186b;

    /* renamed from: c */
    private final int f100187c;

    public azxy(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        this.f100185a = marginLayoutParams;
        this.f100186b = i;
        this.f100187c = i2;
    }

    /* renamed from: a */
    public final C1296qh mo761a(View view, C1296qh qhVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f100185a;
        int i = this.f100186b;
        int i2 = this.f100187c;
        marginLayoutParams.leftMargin = i + qhVar.mo15731a();
        marginLayoutParams.rightMargin = i2 + qhVar.mo15735c();
        return qhVar;
    }
}
