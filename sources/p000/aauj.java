package p000;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aauj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aauj extends LinearLayout implements aatx {

    /* renamed from: a */
    public final aauh f56603a;

    /* renamed from: b */
    public List f56604b;

    /* renamed from: c */
    private final TextView f56605c;

    public aauj(Context context, aatr aatr, bzqi bzqi) {
        super(context);
        setTag(bzqi.f170996b);
        setOrientation(1);
        aauh aauh = new aauh(context, aatr, bzqi, this, true);
        this.f56603a = aauh;
        addView(aauh);
        TextView textView = this.f56603a.f56591a;
        if (textView != null) {
            addView(textView);
        }
        if (bzqi.f171006l) {
            aatk aatk = new aatk(context, bzqi, this);
            this.f56605c = aatk;
            addView(aatk);
            mo31803a();
            return;
        }
        this.f56605c = null;
    }

    /* renamed from: a */
    public final void mo31803a() {
        if (this.f56605c != null) {
            aauh aauh = this.f56603a;
            boolean z = true;
            if (!aauh.f56593c && !aauh.getText().toString().isEmpty()) {
                List list = this.f56604b;
                if (list != null) {
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        int i2 = i + 1;
                        if (((EditText) list.get(i)).getText().toString().isEmpty()) {
                            break;
                        }
                        i = i2;
                    }
                }
                z = false;
            }
            if (this.f56605c.getVisibility() == 0 && z) {
                this.f56605c.setVisibility(8);
            } else if (this.f56605c.getVisibility() == 8 && !z) {
                this.f56605c.setVisibility(0);
            }
        }
    }

    /* renamed from: bz */
    public final List mo31788bz() {
        aauh aauh = this.f56603a;
        if (aauh.f56592b) {
            return Collections.singletonList(aauh);
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public final List mo31789c() {
        ArrayList arrayList = new ArrayList();
        String str = (String) getTag();
        if (this.f56604b == null) {
            arrayList.add(aatb.m46961a(str, this.f56603a.getText().toString()));
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("_0");
            arrayList.add(aatb.m46961a(sb.toString(), this.f56603a.getText().toString()));
            List list = this.f56604b;
            int size = list.size();
            int i = 0;
            int i2 = 1;
            while (i < size) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                sb2.append(str);
                sb2.append("_");
                sb2.append(i2);
                arrayList.add(aatb.m46961a(sb2.toString(), ((EditText) list.get(i)).getText().toString()));
                i++;
                i2++;
            }
        }
        return arrayList;
    }
}
