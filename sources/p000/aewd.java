package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.List;

/* renamed from: aewd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewd extends abh {

    /* renamed from: a */
    private final Activity f63935a;

    /* renamed from: d */
    private final int f63936d;

    /* renamed from: e */
    private final int f63937e;

    /* renamed from: f */
    private final List f63938f;

    public aewd(Activity activity, List list, int i, int i2) {
        this.f63935a = activity;
        this.f63938f = list;
        this.f63936d = i;
        this.f63937e = i2;
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f63938f;
        if (list == null) {
            return 0;
        }
        int i = this.f63936d;
        int size = list.size();
        int i2 = this.f63936d;
        return i + size + (i2 - (((size - 1) % i2) + 1));
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return i >= this.f63936d ? 1 : 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new acm(new FrameLayout(this.f63935a), this.f63935a, this.f63937e);
        }
        return new aewb(LayoutInflater.from(this.f63935a).inflate((int) C0126R.C0128layout.location_sharing_share_item, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        int i2 = this.f63936d;
        if (i >= i2) {
            int i3 = i - i2;
            aewb aewb = (aewb) acm;
            if (i3 >= this.f63938f.size()) {
                aewb.f63931u = null;
                aewb.f63932v.setText("");
                aewb.f63933w.setImageResource(17170445);
                return;
            }
            aewb.mo34617a(this.f63935a, (aevz) this.f63938f.get(i3));
        }
    }
}
