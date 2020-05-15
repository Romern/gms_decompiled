package p000;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: aauq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aauq extends RatingBar implements aatq, aavk {

    /* renamed from: a */
    public final boolean f56616a;

    /* renamed from: b */
    public aave f56617b;

    /* renamed from: c */
    private final List f56618c;

    /* renamed from: d */
    private final TextView f56619d;

    /* renamed from: e */
    private final aatr f56620e;

    /* renamed from: f */
    private List f56621f;

    public aauq(Context context, aatr aatr, bzqk bzqk, List list, TextView textView) {
        super(context);
        setTag(bzqk.f171018b);
        setNumStars(list.size());
        setStepSize(1.0f);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f56618c = list;
        this.f56619d = textView;
        this.f56620e = aatr;
        this.f56616a = bzqk.f171022f;
        setOnRatingBarChangeListener(new aauo(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* renamed from: a */
    public final void mo31809a(int i) {
        String str;
        if (i > this.f56618c.size()) {
            i = this.f56618c.size();
        }
        String valueOf = String.valueOf(getContext().getString(C0126R.string.gh_cuf_rating_selection_prefix));
        if (i > 0) {
            int i2 = i - 1;
            if ((((bzqk) this.f56618c.get(i2)).f171017a & 2) != 0) {
                str = ((bzqk) this.f56618c.get(i2)).f171019c;
                String valueOf2 = String.valueOf(str);
                this.f56619d.setText(valueOf2.length() != 0 ? new String(valueOf) : valueOf.concat(valueOf2));
            }
        }
        str = "";
        String valueOf22 = String.valueOf(str);
        this.f56619d.setText(valueOf22.length() != 0 ? new String(valueOf) : valueOf.concat(valueOf22));
    }

    /* renamed from: a */
    public final void mo31780a(aave aave) {
        this.f56617b = aave;
    }

    /* renamed from: b */
    public final boolean mo31782b() {
        return this.f56620e.getVisibility() == 0;
    }

    /* renamed from: d */
    public final String mo31794d() {
        int rating = (int) getRating();
        if (rating > 0) {
            return ((bzqk) this.f56618c.get(rating - 1)).f171018b;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo31795e() {
        List list = this.f56621f;
        if (list != null) {
            aavg.m47063a(list);
            aave aave = this.f56617b;
            if (aave != null) {
                aave.mo31824a();
            }
        }
    }

    /* renamed from: a */
    public final void mo31792a(List list) {
        this.f56621f = list;
        setOnRatingBarChangeListener(new aaup(this));
    }

    /* renamed from: a */
    public final boolean mo31781a() {
        return ((int) getRating()) > 0;
    }
}
