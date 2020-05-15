package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aquk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aquk extends aqun {

    /* renamed from: a */
    public final int f86838a;

    /* renamed from: b */
    private final List f86839b;

    public aquk(Context context, int i) {
        this(context, i, null);
    }

    /* renamed from: a */
    public void mo48136a() {
        mo48165e();
        for (int i = this.f86838a; i < this.f86839b.size(); i++) {
            ((aqun) this.f86839b.get(i)).mo48136a();
        }
    }

    /* renamed from: b */
    public void mo48137b() {
        mo48166f();
        for (int i = this.f86838a; i < this.f86839b.size(); i++) {
            ((aqun) this.f86839b.get(i)).mo48137b();
        }
    }

    /* renamed from: c */
    public final boolean mo48138c() {
        if (this.f86838a > 0 && !this.f86839b.isEmpty()) {
            return true;
        }
        List list = this.f86839b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((aqun) list.get(i)).mo48138c()) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo48159d() {
        return this.f86839b.isEmpty();
    }

    public aquk(Context context, int i, int i2, Drawable drawable) {
        this(context, i2, drawable);
        LayoutInflater.from(this.f86844c.getContext()).inflate((int) C0126R.C0128layout.composite_entry_title, this.f86844c);
        TextView textView = (TextView) this.f86844c.findViewById(C0126R.C0129id.title);
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* renamed from: a */
    public final void mo48158a(aqun aqun) {
        this.f86839b.add(aqun);
        this.f86844c.addView(aqun.f86844c);
    }

    public aquk(Context context, int i, Drawable drawable) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (drawable != null) {
            linearLayout.setDividerDrawable(drawable);
            linearLayout.setShowDividers(2);
        }
        this.f86844c = linearLayout;
        this.f86839b = new ArrayList();
        this.f86838a = i;
    }

    public aquk(Context context, Drawable drawable) {
        this(context, 0, drawable);
    }
}
