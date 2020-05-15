package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: apws */
final /* synthetic */ class apws implements svb {

    /* renamed from: a */
    static final svb f85023a = new apws();

    private apws() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final sva mo23820a(ViewGroup viewGroup, int i) {
        return new apwv(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.scanned_apps_settings_item, viewGroup, false));
    }
}
