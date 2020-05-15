package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: eww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eww extends ewn {

    /* renamed from: a */
    public final ewz f15956a;

    /* renamed from: d */
    public String f15957d;

    public eww(Context context, List list, evl evl, bswf bswf, ewz ewz, String str, fgt fgt) {
        super(context, m11250a(list, bswf, str), evl, fgt);
        this.f15956a = ewz;
        this.f15957d = str;
    }

    /* renamed from: a */
    public static List m11250a(List list, bswf bswf, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ewu((bsxv) it.next()));
        }
        if (bswf != null && !stm.m36302d(str)) {
            arrayList.add(new ewt(bswf));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        int a = ((ewj) this.f15934f.get(i)).mo10503a();
        if (a == 6 || a == 7) {
            return a - 1;
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.f15937i);
        if (i == 5) {
            return new ewv(this, from.inflate((int) C0126R.C0128layout.as_search_item, viewGroup, false));
        }
        if (i == 6) {
            return new ews(this, from.inflate((int) C0126R.C0128layout.as_search_item, viewGroup, false));
        }
        return super.mo10553a(viewGroup);
    }
}
