package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: aukx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukx extends DialogFragment {

    /* renamed from: e */
    private static final aunx f92006e = new aunx("TrustAgent", "SmartLockStatusDetailDialog");

    /* renamed from: a */
    final List f92007a = new ArrayList();

    /* renamed from: b */
    final HashMap f92008b = new HashMap();

    /* renamed from: c */
    ExpandableListAdapter f92009c;

    /* renamed from: d */
    ExpandableListView f92010d;

    public final Dialog onCreateDialog(Bundle bundle) {
        aumv aumv;
        this.f92007a.add("OnBody");
        this.f92007a.add("Place");
        if (cgzt.m147779d()) {
            this.f92007a.add("Bluetooth");
        }
        if (cgzt.f188132a.mo6606a().mo84832q()) {
            this.f92007a.add("NFC");
        }
        this.f92007a.add("FaceUnlock");
        this.f92007a.add("VoiceUnlock");
        aumr a = aumr.m77322a(getActivity());
        String string = getArguments().getString("status_model_id");
        C1349sg sgVar = new C1349sg(getActivity());
        int i = 0;
        try {
            aumt aumt = (aumt) a.mo50674a(aumt.class, string);
            this.f92008b.put("SmartLock_status_model", aumt);
            ArrayList arrayList = new ArrayList(this.f92007a);
            int i2 = 0;
            while (i2 < arrayList.size()) {
                String str = (String) arrayList.get(i2);
                aumr aumr = auox.m77526a().f92237b;
                HashMap hashMap = new HashMap();
                Object[] objArr = new Object[6];
                objArr[i] = "Trustlet";
                objArr[1] = "Trustlet";
                objArr[2] = "__id__";
                objArr[3] = string;
                objArr[4] = aumv.f92108c.f92120a;
                objArr[5] = str;
                hashMap.put("sql_query_key", String.format("SELECT * FROM %s WHERE _id = (SELECT MAX(_id) FROM %s WHERE %s <= %s AND %s = '%s')", objArr));
                List a2 = aumr.mo50675a(aumv.class, hashMap);
                if (a2.isEmpty()) {
                    aumv = null;
                } else if (a2.size() != 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45);
                    sb.append("Error, get more than one past ");
                    sb.append(str);
                    sb.append(" status models.");
                    Log.e("Coffee-TrustStatusMonitor", sb.toString());
                    aumv = null;
                } else {
                    aumv = (aumv) a2.get(0);
                }
                if (aumv == null) {
                    this.f92007a.remove(str);
                } else {
                    this.f92008b.put(str, aumv);
                }
                i2++;
                i = 0;
            }
            this.f92007a.add(i, "SmartLock_status_model");
            if (((Boolean) aumt.mo50671a(aumt.f92099g)).booleanValue()) {
                sgVar.mo15891a((int) C0126R.C0127drawable.quantum_ic_lock_open_white_24);
            } else {
                sgVar.mo15891a((int) C0126R.C0127drawable.quantum_ic_lock_outline_white_24);
            }
            Object[] objArr2 = new Object[1];
            objArr2[i] = aukz.m77248a(Long.valueOf(aumt.f92085d).longValue(), "MM-dd HH:mm");
            sgVar.mo15908b(getString(C0126R.string.auth_trust_agent_trust_status_monitor_status_detail_title, objArr2));
        } catch (aumn e) {
            f92006e.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
        }
        View inflate = LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.auth_trust_status_monitor_status_detail_expandable_list_view, (ViewGroup) null);
        this.f92010d = (ExpandableListView) inflate.findViewById(C0126R.C0129id.auth_trust_status_monitor_status_detail_expandable_list_view_key);
        aukw aukw = new aukw(getActivity(), this.f92007a, this.f92008b);
        this.f92009c = aukw;
        this.f92010d.setAdapter(aukw);
        this.f92010d.expandGroup(0);
        sgVar.mo15907b(inflate);
        sgVar.mo15901a(getString(C0126R.string.common_cancel), (DialogInterface.OnClickListener) null);
        return sgVar.mo15904b();
    }
}
