package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqul extends aqun {

    /* renamed from: a */
    public final List f86840a;

    /* renamed from: b */
    public int f86841b;

    public aqul(Context context, String str) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f86844c = linearLayout;
        if (!TextUtils.isEmpty(str)) {
            LayoutInflater.from(this.f86844c.getContext()).inflate((int) C0126R.C0128layout.composite_entry_title, this.f86844c);
            TextView textView = (TextView) this.f86844c.findViewById(C0126R.C0129id.title);
            textView.setVisibility(0);
            textView.setText(str);
        }
        this.f86841b = 0;
        this.f86840a = new ArrayList();
    }

    /* renamed from: a */
    public final void mo48136a() {
        mo48160a(this.f86841b + Math.min(this.f86840a.size() - this.f86841b, this.f86844c.getContext().getResources().getInteger(C0126R.integer.reporting_chain_max_num_rows_to_expand_at_once)));
    }

    /* renamed from: b */
    public final void mo48137b() {
        mo48166f();
        if (this.f86840a.size() >= 3) {
            for (int i = 3; i < this.f86840a.size(); i++) {
                ((aquq) this.f86840a.get(i)).mo48137b();
            }
            this.f86841b = 3;
            return;
        }
        this.f86841b = this.f86840a.size();
    }

    /* renamed from: c */
    public final boolean mo48138c() {
        return !this.f86840a.isEmpty();
    }

    /* renamed from: d */
    public final boolean mo48162d() {
        return this.f86841b < this.f86840a.size();
    }

    /* renamed from: a */
    public final void mo48160a(int i) {
        if (i >= 0) {
            mo48165e();
            int min = Math.min(i, this.f86840a.size());
            for (int i2 = this.f86841b; i2 < min; i2++) {
                ((aquq) this.f86840a.get(i2)).mo48136a();
            }
            this.f86841b = min;
        }
    }

    /* renamed from: a */
    public final void mo48161a(aquq aquq) {
        this.f86840a.add(aquq);
        this.f86844c.addView(aquq.f86844c);
    }
}
