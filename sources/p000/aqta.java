package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqta extends aquk {

    /* renamed from: b */
    private final boolean f86733b;

    public aqta(Context context, int i, boolean z) {
        super(context, i, 0, null);
        this.f86733b = z;
        int paddingLeft = this.f86844c.findViewById(C0126R.C0129id.title).getPaddingLeft();
        this.f86844c.findViewById(C0126R.C0129id.title).setPadding(paddingLeft, 0, paddingLeft, context.getResources().getDimensionPixelSize(C0126R.dimen.card_entry_text_padding));
    }

    /* renamed from: a */
    public final void mo48136a() {
        this.f86844c.setVisibility(0);
        super.mo48136a();
    }

    /* renamed from: b */
    public final void mo48137b() {
        if (!this.f86733b) {
            this.f86844c.setVisibility(8);
        } else if (mo48138c()) {
            super.mo48137b();
        }
    }
}
