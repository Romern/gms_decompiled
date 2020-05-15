package p000;

/* renamed from: aujj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aujj extends auke {
    /* renamed from: a */
    public int mo50597a() {
        return 524290;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean c = cgzf.m147724c();
        int length = objArr.length;
        if (length >= 2) {
            try {
                mo50599a(auji, (String) objArr[0], ((Integer) objArr[1]).intValue());
            } catch (ClassCastException e) {
                if (!c) {
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50599a(auji auji, String str, int i) {
        String valueOf = String.valueOf(str);
        auji.mo50592b(valueOf.length() == 0 ? new String("tron_varz_") : "tron_varz_".concat(valueOf), i);
    }
}
