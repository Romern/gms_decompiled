package p000;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aaur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaur extends LinearLayout implements aatx {

    /* renamed from: a */
    private final List f56622a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      aatj.a(android.view.View, int, android.view.View$OnClickListener):void
      aatj.a(android.widget.EditText, java.lang.String, boolean):void
      aatj.a(android.widget.TextView, abbi, bzps):void
      aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaur(Context context, aatr aatr, bzqi bzqi) {
        super(context);
        Context context2 = context;
        bzqi bzqi2 = bzqi;
        setTag(bzqi2.f170996b);
        setOrientation(1);
        this.f56622a = new ArrayList(bzqi2.f171000f.size());
        bxwc bxwc = bzqi2.f171000f;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bzqk bzqk = (bzqk) bxwc.get(i);
            bxwc bxwc2 = bzqi2.f171008n;
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setOrientation(1);
            linearLayout.addView(aatj.m46987b(context2, stm.m36299a(bzqk.f171019c), bzqk.f171022f));
            TextView a = aatj.m46978a(context2, context2.getString(C0126R.string.gh_cuf_rating_selection_prefix), false);
            linearLayout.addView(a);
            aauq aauq = new aauq(context, aatr, bzqk, bxwc2, a);
            this.f56622a.add(aauq);
            aatr.mo31783a(aauq);
            linearLayout.addView(aauq);
            addView(linearLayout);
        }
    }

    /* renamed from: bz */
    public final List mo31788bz() {
        ArrayList arrayList = new ArrayList();
        List list = this.f56622a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aauq aauq = (aauq) list.get(i);
            if (aauq.f56616a) {
                arrayList.add(aauq);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo31789c() {
        ArrayList arrayList = new ArrayList();
        List list = this.f56622a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aauq aauq = (aauq) list.get(i);
            String d = aauq.mo31794d();
            if (d != null) {
                arrayList.add(aatb.m46961a((String) aauq.getTag(), d));
            }
        }
        return arrayList;
    }
}
