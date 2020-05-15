package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: etu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class etu extends ewn {

    /* renamed from: a */
    public final LinearLayout f15690a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public etu(Context context, List list, evl evl, LinearLayout linearLayout, fgt fgt) {
        super(context, r0, evl, fgt);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new etl((bsui) list.get(i)));
        }
        this.f15690a = linearLayout;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return C0126R.C0128layout.as_card_action_chip;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new eto(this, LayoutInflater.from(this.f15937i).inflate(i, viewGroup, false), this.f15938j);
    }
}
