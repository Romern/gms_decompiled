package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.debug.items.ModuleItem;
import java.util.Locale;

/* renamed from: qph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qph implements qoz {

    /* renamed from: a */
    private final ModuleItem f41916a;

    public qph(ModuleItem moduleItem) {
        this.f41916a = moduleItem;
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
            view = layoutInflater.inflate((int) C0126R.C0128layout.list_item_module, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.apk_type);
        int i = this.f41916a.f29999e;
        textView.setText(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "[ ? ]" : "[ S ]" : "[ F ]" : "[ I ]" : "[ C ]");
        ((TextView) view.findViewById(C0126R.C0129id.module_id)).setText(qpr.m32629a(this.f41916a.f29996b));
        ((TextView) view.findViewById(C0126R.C0129id.module_set_variant)).setText(String.format(Locale.ENGLISH, "%d", Integer.valueOf(this.f41916a.f29997c)));
        return view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24187a() {
        return this.f41916a;
    }

    /* renamed from: b */
    public final int mo24188b() {
        return 1;
    }
}
