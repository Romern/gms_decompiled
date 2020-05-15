package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.CRC32;

/* renamed from: aqje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqje {

    /* renamed from: c */
    private static final sek f86193c = new sek("SetupServices", "AuditedText");

    /* renamed from: a */
    public final CharSequence f86194a;

    /* renamed from: b */
    public final List f86195b;

    public aqje(CharSequence charSequence, List list) {
        this.f86194a = charSequence;
        this.f86195b = list;
    }

    /* renamed from: a */
    public static aqje m71717a(Context context, int i) {
        if (i == 0) {
            return null;
        }
        bxvd da = bsrz.f146816d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrz bsrz = (bsrz) da.f164949b;
        bsrz.f146818a |= 1;
        bsrz.f146819b = i;
        return new aqje(context.getText(i), (bsrz) da.mo74062i());
    }

    public aqje(CharSequence charSequence, bsrz... bsrzArr) {
        this(charSequence, Arrays.asList(bsrzArr));
    }

    /* renamed from: a */
    public final aqje mo47910a(String str, aqje aqje) {
        if (aqje == null) {
            return this;
        }
        CharSequence concat = TextUtils.concat(this.f86194a, str, aqje.f86194a);
        ArrayList arrayList = new ArrayList(this.f86195b);
        arrayList.addAll(aqje.f86195b);
        return new aqje(concat, arrayList);
    }

    /* renamed from: a */
    public final aqje mo47911a(aqje... aqjeArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f86195b);
        CharSequence[] charSequenceArr = {aqjeArr[0].f86194a};
        arrayList.addAll(aqjeArr[0].f86195b);
        return new aqje(TextUtils.expandTemplate(this.f86194a, charSequenceArr), arrayList);
    }

    /* renamed from: a */
    public final bssa mo47912a() {
        bxvd da = bssa.f146821d.mo74144da();
        List list = this.f86195b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssa bssa = (bssa) da.f164949b;
        if (!bssa.f146825c.mo73666a()) {
            bssa.f146825c = bxvk.m124021a(bssa.f146825c);
        }
        bxsy.m123078a(list, bssa.f146825c);
        try {
            CRC32 crc32 = new CRC32();
            crc32.update(this.f86194a.toString().getBytes("UTF-8"));
            long value = crc32.getValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssa bssa2 = (bssa) da.f164949b;
            bssa2.f146823a |= 1;
            bssa2.f146824b = value;
        } catch (UnsupportedEncodingException e) {
            sek sek = f86193c;
            String valueOf = String.valueOf(this.f86194a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Unable to decode \"");
            sb.append(valueOf);
            sb.append("\"");
            sek.mo25417e(sb.toString(), e, new Object[0]);
        }
        return (bssa) da.mo74062i();
    }
}
