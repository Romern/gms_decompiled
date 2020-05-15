package p000;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: aauk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aauk extends RadioButton {

    /* renamed from: a */
    public final EditText f56606a;

    public aauk(Context context, int i, bzqk bzqk) {
        super(context);
        setTag(bzqk.f171018b);
        if (!TextUtils.isEmpty(bzqk.f171019c)) {
            setText(bzqk.f171019c);
        }
        setId(i);
        this.f56606a = bzqk.f171021e ? aatj.m46977a(context, this) : null;
    }

    /* renamed from: a */
    public final boolean mo31804a() {
        return this.f56606a != null;
    }
}
