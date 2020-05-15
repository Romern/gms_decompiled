package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
import java.util.Collections;
import java.util.List;

/* renamed from: ayjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjd extends BaseAdapter {

    /* renamed from: a */
    private final List f97751a;

    /* renamed from: b */
    private final LayoutInflater f97752b;

    /* renamed from: c */
    private final Context f97753c;

    public ayjd(Activity activity, axoo axoo) {
        List list = axoo.mo53314b().f110968c;
        this.f97751a = list;
        Collections.sort(list, new ayjb());
        this.f97752b = activity.getLayoutInflater();
        this.f97753c = activity.getApplicationContext();
    }

    /* renamed from: a */
    public final PackageStorageInfo getItem(int i) {
        return (PackageStorageInfo) this.f97751a.get(i);
    }

    public final int getCount() {
        return this.f97751a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        if (view == null) {
            view = this.f97752b.inflate((int) C0126R.C0128layout.manage_applications_item, (ViewGroup) null);
            view.setTag(new ayjc(this.f97753c, view));
        }
        ayjc ayjc = (ayjc) view.getTag();
        PackageStorageInfo a = getItem(i);
        ayjc.f97747a.setText(a.f110957b);
        TextView textView = ayjc.f97748b;
        long j = a.f110958c;
        if (j >= 0) {
            str = Formatter.formatFileSize(ayjc.f97750d, j);
        } else {
            str = null;
        }
        textView.setText(str);
        try {
            ayjc.f97749c.setImageDrawable(ayjc.f97750d.getPackageManager().getApplicationIcon(a.f110956a));
        } catch (PackageManager.NameNotFoundException e) {
            ayjc.f97749c.setImageDrawable(null);
        }
        return view;
    }
}
