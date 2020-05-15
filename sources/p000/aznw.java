package p000;

import android.database.Cursor;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.Map;

/* renamed from: aznw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aznw extends aznc {

    /* renamed from: j */
    public Map f99756j;

    /* renamed from: k */
    private final aznj f99757k;

    public aznw(Activity activity, azcb azcb, azmy azmy, aznz aznz, azmz azmz, LruCache lruCache, Map map, aznd aznd, azni azni, aznf aznf, aznj aznj, azng azng) {
        super(activity, azcb, azmy, aznz, azmz, lruCache, aznd, azni, aznf, azng);
        this.f99756j = map;
        this.f99757k = aznj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo55095a(ViewGroup viewGroup, Cursor cursor) {
        if (cfdh.m138725b() && azns.m85869a(cursor) && !cursor.isLast() && cursor.moveToNext()) {
            boolean a = azns.m85869a(cursor);
            cursor.moveToPrevious();
            if (a) {
                View inflate = LayoutInflater.from(this.f99695b).inflate((int) C0126R.C0128layout.ms_empty_message, viewGroup, false);
                inflate.setTag("skipped");
                return inflate;
            }
        }
        return LayoutInflater.from(this.f99694a).inflate((int) C0126R.C0128layout.ms_unsupported_message_item, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014b  */
    /* renamed from: b */
    public final void mo55090b(View view, Cursor cursor) {
        int i;
        String str;
        cbil cbil;
        if (!(view.getTag() instanceof String) || !TextUtils.equals((String) view.getTag(), "skipped")) {
            boolean a = azns.m85869a(cursor);
            if (!cfdh.m138725b()) {
                i = 1;
            } else if (a) {
                int position = cursor.getPosition();
                Object[] objArr = {cursor.getString(1), Integer.valueOf(position)};
                i = 1;
                while (cursor.moveToPrevious() && azns.m85869a(cursor)) {
                    i++;
                }
                new Object[1][0] = Integer.valueOf(i);
                cursor.moveToPosition(position);
            } else {
                i = 1;
            }
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.unsupported_message_text_view);
            TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.unsupported_message_text_secondary_view);
            Button button = (Button) view.findViewById(C0126R.C0129id.install_button);
            Integer num = this.f99696c.f98952b;
            if (num != null) {
                textView.setTextColor(num.intValue());
                textView2.setTextColor(num.intValue());
                button.setTextColor(num.intValue());
                ((GradientDrawable) view.findViewById(C0126R.C0129id.ms_unsupported_message_container).getBackground()).setStroke(azpi.m86074b(1), num.intValue());
            }
            textView2.setText(this.f99694a.getString(C0126R.string.unsupported_message_text, this.f99697d.mo55081u()));
            String string = cursor.getString(8);
            if (a && i > 1) {
                String str2 = (String) this.f99756j.get(Long.valueOf(cfdh.f183653a.mo6606a().mo80858b()));
                if (!TextUtils.isEmpty(str2)) {
                    str = azov.m85980a(str2, bnhe.m109409a("senderName", this.f99699f.f99691a, "numberOfMessages", Integer.toString(i)));
                    if (TextUtils.isEmpty(str)) {
                        str = this.f99694a.getResources().getString(C0126R.string.fallback_message_text_with_sender_name, this.f99699f.f99691a);
                    }
                    textView.setText(str);
                    ((aznb) this.f99757k).f99692a = true;
                    aznv aznv = new aznv(this);
                    view.setOnClickListener(aznv);
                    button.setOnClickListener(aznv);
                    mo55092d(view, cursor);
                    mo55091c(view, cursor);
                }
            } else if (azoy.m85996l(string) && (cbil = (cbil) mo55088a(cbil.class, (bxxk) cbil.f177257h.mo74142c(7), cursor.getBlob(7), cursor.getPosition())) != null) {
                long j = cbil.f177264f;
                if (j != 0) {
                    String str3 = (String) this.f99756j.get(Long.valueOf(j));
                    if (!TextUtils.isEmpty(str3)) {
                        str = azov.m85980a(str3, bnhe.m109408a("senderName", this.f99699f.f99691a));
                        if (TextUtils.isEmpty(str)) {
                        }
                        textView.setText(str);
                        ((aznb) this.f99757k).f99692a = true;
                        aznv aznv2 = new aznv(this);
                        view.setOnClickListener(aznv2);
                        button.setOnClickListener(aznv2);
                        mo55092d(view, cursor);
                        mo55091c(view, cursor);
                    }
                }
            }
            str = "";
            if (TextUtils.isEmpty(str)) {
            }
            textView.setText(str);
            ((aznb) this.f99757k).f99692a = true;
            aznv aznv22 = new aznv(this);
            view.setOnClickListener(aznv22);
            button.setOnClickListener(aznv22);
            mo55092d(view, cursor);
            mo55091c(view, cursor);
        }
    }
}
