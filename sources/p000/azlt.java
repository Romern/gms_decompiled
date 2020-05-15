package p000;

import android.content.DialogInterface;

/* renamed from: azlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azlt implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ azlx f99594a;

    public azlt(azlx azlx) {
        this.f99594a = azlx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new Object[1][0] = Integer.valueOf(i);
        azph.m85998a(this.f99594a.getActivity()).mo55137a(bopu.m111432b(this.f99594a.getArguments().getInt("userEvent")), this.f99594a.f99604g);
        azlx azlx = this.f99594a;
        int i2 = azlx.f99598a;
        if (i2 == azlx.f99599b) {
            azlx.f99602e.mo55033f();
        } else if (i2 == azlx.f99600c) {
            azlx.f99602e.mo55034g();
        } else if (i2 == azlx.f99601d) {
            azlx.f99602e.mo55035k();
        }
    }
}
