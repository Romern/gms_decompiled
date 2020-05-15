package p000;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aukw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukw extends BaseExpandableListAdapter {

    /* renamed from: a */
    final HashMap f92001a;

    /* renamed from: b */
    final String[] f92002b = {"Trusted", "Configuration", "Device idle", "User switched", "Trusted trustlets"};

    /* renamed from: c */
    final String[] f92003c = {"Trusted", "Configuration", "Started"};

    /* renamed from: d */
    private final Context f92004d;

    /* renamed from: e */
    private final List f92005e;

    public aukw(Context context, List list, HashMap hashMap) {
        new HashMap();
        this.f92004d = context;
        this.f92005e = list;
        this.f92001a = hashMap;
    }

    /* renamed from: a */
    public final Pair getChild(int i, int i2) {
        auml auml = (auml) this.f92001a.get(this.f92005e.get(i));
        if (((String) this.f92005e.get(i)).equals("SmartLock_status_model")) {
            aumt aumt = (aumt) auml;
            String[] strArr = new String[5];
            strArr[0] = mo50629a((Boolean) auml.mo50671a(aumt.f92099g));
            strArr[1] = mo50629a((Boolean) auml.mo50671a(aumt.f92100h));
            strArr[2] = mo50629a((Boolean) auml.mo50671a(aumt.f92102j));
            strArr[3] = mo50629a((Boolean) auml.mo50671a(aumt.f92103k));
            ArrayList arrayList = new ArrayList();
            String str = (String) aumt.mo50671a(aumt.f92104l);
            if (str == null) {
                str = "";
            }
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("Trusted Trustlets");
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    arrayList.add(optJSONArray.optString(i3));
                }
            } catch (JSONException e) {
            }
            strArr[4] = arrayList.toString();
            return new Pair(this.f92002b[i2], strArr[i2]);
        }
        return new Pair(this.f92003c[i2], new String[]{mo50629a((Boolean) auml.mo50671a(aumv.f92109f)), mo50629a((Boolean) auml.mo50671a(aumv.f92113j)), mo50629a((Boolean) auml.mo50671a(aumv.f92112i))}[i2]);
    }

    public final long getChildId(int i, int i2) {
        return (long) i2;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        Pair a = getChild(i, i2);
        if (view == null) {
            view = ((LayoutInflater) this.f92004d.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.f7378x4f46cb33, (ViewGroup) null);
        }
        ((TextView) view.findViewById(C0126R.C0129id.f7436x9b0da5ec)).setText((CharSequence) a.first);
        ((TextView) view.findViewById(C0126R.C0129id.f7437xecb6e085)).setText((CharSequence) a.second);
        return view;
    }

    public final int getChildrenCount(int i) {
        if (((String) this.f92005e.get(i)).equals("SmartLock_status_model")) {
            return this.f92002b.length;
        }
        return this.f92003c.length;
    }

    public final Object getGroup(int i) {
        return this.f92005e.get(i);
    }

    public final int getGroupCount() {
        return this.f92005e.size();
    }

    public final long getGroupId(int i) {
        return (long) i;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        String str = (String) getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.f92004d.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.f7379x4af22fb0, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.f7438x221fa550);
        textView.setTypeface(null, 1);
        textView.setText(str);
        return view;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    /* renamed from: a */
    public final String mo50629a(Boolean bool) {
        if (bool == null) {
            return this.f92004d.getString(C0126R.string.auth_trust_agent_trust_status_monitor_boolean_null_ui_value);
        }
        return bool.booleanValue() ? this.f92004d.getString(C0126R.string.auth_trust_agent_trust_status_monitor_boolean_true_ui_value) : this.f92004d.getString(C0126R.string.auth_trust_agent_trust_status_monitor_boolean_false_ui_value);
    }
}
