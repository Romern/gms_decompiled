package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Fragment;
import com.google.android.gms.plus.service.v1whitelisted.models.ItemScope;
import java.util.ArrayList;

/* renamed from: annr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annr extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    public final annq f77217a;

    /* renamed from: b */
    public final ArrayList f77218b = new ArrayList();

    /* renamed from: c */
    public boolean f77219c;

    /* renamed from: d */
    private final LayoutInflater f77220d;

    public annr(Context context, annq annq) {
        this.f77220d = LayoutInflater.from(context);
        this.f77217a = annq;
    }

    /* renamed from: a */
    public final aohj getItem(int i) {
        if (i < this.f77218b.size()) {
            return (aohj) this.f77218b.get(i);
        }
        return null;
    }

    public final int getCount() {
        return this.f77218b.size() + (this.f77219c ? 1 : 0);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return i < this.f77218b.size() ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [com.google.android.chimera.LoaderManager$LoaderCallbacks, annq], assign insn: 0x0017: IGET  (r6v9 ? I:annq) = (r5v0 'this' annr A[THIS]) annr.a annq */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        String str2;
        String str3 = null;
        if (i >= this.f77218b.size()) {
            if (view == null) {
                view = this.f77220d.inflate((int) C0126R.C0128layout.plus_list_apps_item_loading, viewGroup, false);
            }
            ? r6 = this.f77217a;
            ((Fragment) r6).getLoaderManager().restartLoader(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, null, r6);
        } else {
            if (view == null) {
                view = this.f77220d.inflate((int) C0126R.C0128layout.plus_list_moments_item, viewGroup, false);
            }
            aohj aohj = (aohj) this.f77218b.get(i);
            ItemScope i2 = aohj.mo42751i();
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.icon);
            if (i2 != null) {
                str = i2.f82948c;
            } else {
                str = null;
            }
            annx annx = (annx) this.f77217a;
            Drawable a = annx.f77247d.mo42012a(str);
            if (a == null) {
                annx.f77246c.mo42017a(str);
            }
            imageView.setImageDrawable(a);
            imageView.setOnClickListener(this);
            imageView.setTag(aohj);
            ((TextView) view.findViewById(C0126R.C0129id.title)).setText(aohj.mo42747d());
            if (aohj.mo42750h()) {
                try {
                    str2 = anmt.m64787a(view.getContext(), anms.m64784a(aohj.mo42749g()).f77160a).toString();
                } catch (NumberFormatException e) {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            aoem b = aohj.mo42745b();
            if (b != null) {
                str3 = b.mo42629b();
            }
            if (str2 == null) {
                str2 = str3;
            } else if (str3 != null) {
                str2 = String.format(view.getContext().getString(C0126R.string.plus_list_moments_time_acl_format), str2, str3);
            }
            ((TextView) view.findViewById(C0126R.C0129id.time_acl)).setText(str2);
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.DialogInterface$OnClickListener, annq], assign insn: 0x0000: IGET  (r0v0 ? I:annq) = (r2v0 'this' annr A[THIS]) annr.a annq */
    public void onClick(View view) {
        String str;
        ? r0 = this.f77217a;
        aohj aohj = (aohj) view.getTag();
        if (aohj.mo42751i() != null) {
            str = aohj.mo42751i().f82949d;
        } else {
            str = null;
        }
        ((anmf) ((annx) r0)).f77123a.mo41938b(!annj.m64807a(str, ((Fragment) r0).getActivity(), r0) ? rig.f43044l : rig.f43043k, rih.f43053g);
    }
}
