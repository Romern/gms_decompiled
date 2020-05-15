package p000;

import android.view.View;

/* renamed from: atsu */
final /* synthetic */ class atsu implements View.OnClickListener {

    /* renamed from: a */
    private final atsx f90795a;

    public atsu(atsx atsx) {
        this.f90795a = atsx;
    }

    public void onClick(View view) {
        atsx atsx = this.f90795a;
        atsx.mo50161a(atsx.getArguments().getByteArray("extra_instrument_manager_edit_token"));
    }
}
