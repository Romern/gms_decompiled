package p000;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqsz extends aqun {

    /* renamed from: a */
    private final TextView f86732a = ((TextView) this.f86844c.findViewById(C0126R.C0129id.text));

    public aqsz(aqtb aqtb, String str) {
        super((ViewGroup) LayoutInflater.from(aqtb.f86734a).inflate((int) C0126R.C0128layout.card_entry_text_only, (ViewGroup) null));
        int i;
        Spanned a = tey.m36889a(str);
        this.f86732a.setText(a.toString().trim());
        this.f86732a.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.f86732a;
        if (C1280ps.m19923h(textView) == 1) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        mo48164a(a.toString());
    }

    /* renamed from: a */
    public final void mo48136a() {
        this.f86732a.setMaxLines(50);
    }

    /* renamed from: b */
    public final void mo48137b() {
        this.f86732a.setMaxLines(5);
    }

    /* renamed from: c */
    public final boolean mo48138c() {
        return true;
    }
}
