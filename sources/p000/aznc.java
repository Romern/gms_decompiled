package p000;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.matchstick.data.LocalEntityId;

/* renamed from: aznc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aznc implements aznk {

    /* renamed from: a */
    protected final Context f99694a;

    /* renamed from: b */
    public Activity f99695b;

    /* renamed from: c */
    public azcb f99696c;

    /* renamed from: d */
    protected final azmy f99697d;

    /* renamed from: e */
    protected final LruCache f99698e;

    /* renamed from: f */
    protected azna f99699f;

    /* renamed from: g */
    protected final aznz f99700g;

    /* renamed from: h */
    public azmz f99701h;

    /* renamed from: i */
    public final aznf f99702i;

    /* renamed from: j */
    private final aznd f99703j;

    /* renamed from: k */
    private final azni f99704k;

    /* renamed from: l */
    private final azng f99705l;

    protected aznc(Activity activity, azcb azcb, azmy azmy, aznz aznz, azmz azmz, LruCache lruCache, aznd aznd, azni azni, aznf aznf, azng azng) {
        this.f99694a = activity.getApplicationContext();
        this.f99695b = activity;
        this.f99696c = azcb;
        this.f99697d = azmy;
        this.f99701h = azmz;
        this.f99700g = aznz;
        this.f99698e = lruCache;
        this.f99703j = aznd;
        this.f99704k = azni;
        this.f99702i = aznf;
        this.f99705l = azng;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo55088a(Class cls, bxxk bxxk, byte[] bArr, int i) {
        LruCache lruCache = this.f99698e;
        if (lruCache == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(i);
        bxxc bxxc = (bxxc) lruCache.get(valueOf);
        if (bxxc != null && cls.isInstance(bxxc)) {
            return (bxxc) cls.cast(bxxc);
        }
        bxxc a = azol.m85935a(bxxk, bArr);
        if (a != null) {
            this.f99698e.put(valueOf, a);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo55090b(View view, Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo55091c(View view, Cursor cursor) {
        int i;
        aznd aznd = this.f99703j;
        if (aznd != null) {
            View findViewById = view.findViewById(C0126R.C0129id.ms_message_avatar);
            if (findViewById != null) {
                if (!aznd.m85862a(cursor)) {
                    i = 8;
                } else {
                    i = 0;
                }
                findViewById.setVisibility(i);
            }
            if (!azns.m85871b(cursor)) {
                if (findViewById != null) {
                    findViewById.findViewById(C0126R.C0129id.user_avatar).setVisibility(8);
                }
            } else if (findViewById == null) {
            } else {
                if (aznd.m85862a(cursor)) {
                    findViewById.findViewById(C0126R.C0129id.user_avatar).setVisibility(0);
                    LocalEntityId localEntityId = new LocalEntityId(cursor.getString(2), cursor.getInt(3), aznd.f99707b.f99775b);
                    azox.m85981a();
                    azcj a = azcj.m85279a(aznd.f99706a);
                    ImageView imageView = (ImageView) findViewById.findViewById(C0126R.C0129id.user_avatar);
                    Bitmap a2 = a.mo54625a(localEntityId);
                    if (a2 == null) {
                        a2 = azny.m85881a(aznd.f99706a);
                    }
                    imageView.setImageBitmap(a2);
                    return;
                }
                findViewById.findViewById(C0126R.C0129id.user_avatar).setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo55092d(View view, Cursor cursor) {
        if (this.f99704k != null) {
            View findViewById = view.findViewById(C0126R.C0129id.sender_timestamp_container);
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.message_text_timestamp);
            long j = cursor.getLong(10);
            if (!azns.m85871b(cursor)) {
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                    if (!view.hasOnClickListeners()) {
                        view.setOnClickListener(new aznh(findViewById, textView, j));
                    }
                }
            } else if (findViewById != null) {
                if (textView != null) {
                    textView.setText(azpi.m86062a(j / 1000));
                }
                findViewById.setVisibility(0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* renamed from: a */
    public final void mo55089a(View view, Cursor cursor) {
        String str;
        bmxv bmxv;
        bmxv bmxv2;
        if (cfeo.f183719a.mo6606a().mo81015bV() && this.f99702i != null) {
            view.findViewById(C0126R.C0129id.ms_message_status).setVisibility(8);
        }
        int i = cursor.getInt(3);
        String string = cursor.getString(6);
        int i2 = cursor.getInt(12);
        if (this.f99700g.mo55104b() && !azdd.m85390c(i2)) {
            if (i == 1 && this.f99701h.f99686b != null) {
                String string2 = cursor.getString(2);
                azmz azmz = this.f99701h;
                if (azmz.f99689e.containsKey(string2)) {
                    bmxv = bmxv.m108566b((String) azmz.f99689e.get(string2));
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    str = (String) bmxv.mo66814b();
                } else {
                    azmz azmz2 = this.f99701h;
                    if (azmz2.f99690f.containsKey(string2)) {
                        bmxv2 = bmxv.m108566b((String) azmz2.f99690f.get(string2));
                    } else {
                        bmxv2 = bmvz.f131120a;
                    }
                    if (bmxv2.mo66813a()) {
                        str = (String) bmxv2.mo66814b();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    str = cursor.getString(4);
                }
                if (TextUtils.equals(str, cursor.getString(4)) || TextUtils.equals(string, str) || TextUtils.isEmpty(string)) {
                    string = str;
                } else {
                    String c = azpi.m86083c(string);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(c).length());
                    sb.append(str);
                    sb.append(" (");
                    sb.append(c);
                    sb.append(")");
                    string = sb.toString();
                }
            }
            str = string;
            if (TextUtils.isEmpty(str)) {
            }
            if (TextUtils.equals(str, cursor.getString(4))) {
            }
            string = str;
        }
        String string3 = cursor.getString(9);
        int i3 = cursor.getInt(3);
        if ((azoy.m85993i(string3) || i3 == 3) && !azns.m85870a(this.f99700g, cursor)) {
            String string4 = cursor.getString(4);
            if (cfeo.m138895z().equals(string4) && !TextUtils.isEmpty(cfeo.m138844A())) {
                string = cfeo.m138844A();
            }
            if (TextUtils.isEmpty(string)) {
                string = string4;
            }
        }
        if (string == null) {
            string = "";
        }
        azna azna = new azna(string);
        this.f99699f = azna;
        aznz aznz = this.f99700g;
        if (this.f99705l != null) {
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.message_text_sender);
            if (textView != null) {
                if (aznz.mo55104b() || !azns.m85870a(aznz, cursor)) {
                    textView.setVisibility(0);
                    view.findViewById(C0126R.C0129id.message_text_separator).setVisibility(0);
                    if (!TextUtils.isEmpty(azna.f99691a)) {
                        textView.setText(azna.f99691a);
                    }
                } else {
                    view.findViewById(C0126R.C0129id.message_text_separator).setVisibility(8);
                    textView.setVisibility(8);
                    textView.setText("");
                }
            }
            view.setOnClickListener(null);
        }
        mo55090b(view, cursor);
    }
}
