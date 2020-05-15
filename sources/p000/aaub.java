package p000;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aaub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaub extends LinearLayout implements aatx {

    /* renamed from: a */
    private final List f56583a;

    public aaub(Context context, aatr aatr, bzqi bzqi) {
        super(context);
        setTag(bzqi.f170996b);
        setOrientation(1);
        this.f56583a = new ArrayList(bzqi.f171000f.size());
        bxwc bxwc = bzqi.f171000f;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            aaua aaua = new aaua(context, aatr, (bzqk) bxwc.get(i));
            this.f56583a.add(aaua);
            aatr.mo31783a(aaua);
            addView(aaua);
            if (aaua.mo31793c()) {
                addView(aaua.f56578a);
            }
        }
    }

    /* renamed from: bz */
    public final List mo31788bz() {
        ArrayList arrayList = new ArrayList();
        List list = this.f56583a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aaua aaua = (aaua) list.get(i);
            if (aaua.f56579b) {
                arrayList.add(aaua);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo31789c() {
        boolean z;
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        String str2 = (String) getTag();
        List list = this.f56583a;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i2 >= size) {
                z = false;
                break;
            } else if (((aaua) list.get(i2)).isChecked() && (i3 = i3 + 1) > 1) {
                break;
            } else {
                i2++;
            }
        }
        List list2 = this.f56583a;
        int size2 = list2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            aaua aaua = (aaua) list2.get(i5);
            if (aaua.isChecked()) {
                String str3 = (String) aaua.getTag();
                if (z) {
                    i = i4 + 1;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                    sb.append(str2);
                    sb.append("_");
                    sb.append(i4);
                    str = sb.toString();
                } else {
                    i = i4;
                    str = str2;
                }
                arrayList.add(aatb.m46961a(str, str3));
                if (aaua.mo31793c()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str3).length());
                    sb2.append(str2);
                    sb2.append("--");
                    sb2.append(str3);
                    arrayList.add(aatb.m46961a(sb2.toString(), aaua.f56578a.getText().toString()));
                }
                i4 = i;
            }
        }
        return arrayList;
    }
}
