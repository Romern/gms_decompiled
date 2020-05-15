package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;
import java.util.Locale;

/* renamed from: qpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qpi implements qoz {

    /* renamed from: a */
    private final ModuleSetItem f41917a;

    public qpi(ModuleSetItem moduleSetItem) {
        this.f41917a = moduleSetItem;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo24186a(LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = layoutInflater.inflate((int) C0126R.C0128layout.list_item_module_set, viewGroup, false);
        }
        ((TextView) view.findViewById(C0126R.C0129id.module_set_name)).setText(this.f41917a.f30005b);
        ((TextView) view.findViewById(C0126R.C0129id.module_set_variant)).setText(String.format(Locale.ENGLISH, "%d", this.f41917a.f30006c));
        return view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24187a() {
        return this.f41917a;
    }

    /* renamed from: b */
    public final int mo24188b() {
        return 2;
    }
}
