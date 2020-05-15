package p000;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.sharebox.AddToCircleChimeraActivity;

/* renamed from: aokr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aokr extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ AddToCircleChimeraActivity f78356a;

    public aokr(AddToCircleChimeraActivity addToCircleChimeraActivity) {
        this.f78356a = addToCircleChimeraActivity;
    }

    /* renamed from: a */
    public final AudienceMember getItem(int i) {
        AddToCircleChimeraActivity addToCircleChimeraActivity = this.f78356a;
        int i2 = AddToCircleChimeraActivity.f83427d;
        return (AudienceMember) addToCircleChimeraActivity.f83430c.f83435e.f30287b.get(i);
    }

    public final int getCount() {
        AddToCircleChimeraActivity addToCircleChimeraActivity = this.f78356a;
        int i = AddToCircleChimeraActivity.f83427d;
        return addToCircleChimeraActivity.f83430c.f83435e.f30287b.size();
    }

    public final long getItemId(int i) {
        return (long) getItem(i).hashCode();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        aoku aoku;
        if (view == null) {
            view = this.f78356a.getLayoutInflater().inflate((int) C0126R.C0128layout.plus_add_to_circle_list_item, viewGroup, false);
            aoku = new aoku(view);
            view.setTag(aoku);
        } else {
            aoku = (aoku) view.getTag();
        }
        view.setOnClickListener(this.f78356a);
        AudienceMember a = getItem(i);
        aoku.f78364a = i;
        aoku.f78365b = a;
        if (a != null) {
            if (TextUtils.isEmpty(a.f30297g)) {
                String str = a.f30295e;
                aoku.f78366c.setTag(str);
                if (ancm.m64020i(str)) {
                    aoku.f78366c.setImageResource(C0126R.C0127drawable.quantum_ic_email_black_24);
                }
            } else {
                aoku.f78366c.setTag(a.f30297g);
                String str2 = a.f30297g;
                ImageView imageView = aoku.f78366c;
                if (str2.equals(imageView.getTag())) {
                    AddToCircleChimeraActivity addToCircleChimeraActivity = this.f78356a;
                    int i2 = AddToCircleChimeraActivity.f83427d;
                    Bitmap bitmap = (Bitmap) addToCircleChimeraActivity.f83429b.mo15546a(str2);
                    if (bitmap == null) {
                        rjo rjo = allr.f73629a;
                        amcy.m62630a(this.f78356a.f83428a, str2, 1, 1).mo9458a(new aokt(this.f78356a, str2, imageView));
                    } else {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            }
            aoku.f78367d.setText(a.f30296f);
            aoku.f78368e.setChecked(a.f30298h.getBoolean("checked", false));
        }
        return view;
    }
}
