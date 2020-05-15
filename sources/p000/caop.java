package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: caop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caop extends caoj {

    /* renamed from: b */
    public static final byte[] f175483b = {119};

    /* renamed from: c */
    public static final byte[] f175484c = {-97, 39};

    /* renamed from: d */
    public static final byte[] f175485d = {-97, 54};

    /* renamed from: e */
    public static final byte[] f175486e = {-97, 38};

    /* renamed from: f */
    public static final byte[] f175487f = {-97, 16};

    /* renamed from: g */
    public static final byte[] f175488g = {-97, 75};

    /* renamed from: h */
    private final caox f175489h;

    /* renamed from: i */
    private final caoo f175490i;

    /* renamed from: j */
    private final caqk f175491j;

    /* renamed from: k */
    private final capy f175492k;

    /* renamed from: l */
    private final caqv f175493l;

    /* renamed from: m */
    private final byte[] f175494m;

    /* renamed from: n */
    private final int f175495n;

    /* renamed from: o */
    private final cary f175496o;

    public caop(caoo caoo, caqk caqk, capy capy, caqv caqv) {
        this.f175489h = null;
        this.f175490i = caoo;
        this.f175491j = caqk;
        this.f175492k = capy;
        this.f175493l = caqv;
        this.f175494m = null;
        this.f175496o = null;
        this.f175495n = -1;
        LinkedList linkedList = new LinkedList();
        linkedList.add(cath.m127170a(f175484c, new byte[]{this.f175493l.f175623d}));
        linkedList.add(cath.m127170a(f175485d, this.f175493l.f175620a));
        linkedList.add(cath.m127170a(f175486e, this.f175493l.f175622c));
        linkedList.add(cath.m127170a(f175487f, this.f175493l.f175621b));
        capy capy2 = this.f175492k;
        if (capy2 != null) {
            linkedList.add(capy2.mo74753e());
        }
        byte[] a = cath.m127170a(f175483b, catg.m127161a(linkedList));
        catg.m127165b(linkedList);
        mo74724a(a);
        catg.m127166c(a);
    }

    /* renamed from: a */
    private final int m126883a() {
        try {
            caox caox = this.f175489h;
            cary cary = this.f175496o;
            return ((capu) caox).mo74735a(new BigInteger(new String(boan.f132472f.mo68794a(cary.f175718a)), 16), new BigInteger(new String(boan.f132472f.mo68794a(cary.f175719b)), 16), new BigInteger(new String(boan.f132472f.mo68794a(cary.f175720c)), 16), new BigInteger(new String(boan.f132472f.mo68794a(cary.f175721d)), 16), new BigInteger(new String(boan.f132472f.mo68794a(cary.f175722e)), 16));
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new capk(valueOf.length() == 0 ? new String("Unable to initialize the private key: ") : "Unable to initialize the private key: ".concat(valueOf));
        }
    }

    /* renamed from: c */
    private final byte[] m126886c() {
        LinkedList linkedList = new LinkedList();
        byte[] bArr = this.f175491j.f175558j;
        if (bArr != null) {
            linkedList.add(bArr);
        }
        linkedList.add(this.f175490i.f175466b);
        linkedList.add(cath.m127170a(f175484c, new byte[]{this.f175493l.f175623d}));
        linkedList.add(cath.m127170a(f175485d, this.f175493l.f175620a));
        linkedList.add(cath.m127170a(f175487f, this.f175493l.f175621b));
        capy capy = this.f175492k;
        if (capy != null) {
            linkedList.add(capy.mo74753e());
        }
        byte[] a = catg.m127161a(linkedList);
        try {
            byte[] e = catg.m127169e(a);
            catg.m127165b(linkedList);
            catg.m127166c(a);
            return e;
        } catch (NoSuchAlgorithmException e2) {
            throw new capk(e2.getMessage());
        } catch (Throwable th) {
            catg.m127165b(linkedList);
            catg.m127166c(a);
            throw th;
        }
    }

    /* renamed from: b */
    private final byte[] m126884b() {
        byte[] bArr;
        byte[] bArr2 = {5, 1, 38};
        byte[] bArr3 = this.f175494m;
        if (bArr3.length == 16) {
            bArr = Arrays.copyOfRange(bArr3, 8, 16);
        } else {
            bArr = Arrays.copyOfRange(bArr3, 0, 8);
        }
        byte[] bArr4 = new byte[(this.f175495n - 63)];
        Arrays.fill(bArr4, (byte) -69);
        LinkedList linkedList = new LinkedList();
        linkedList.add(bArr2);
        linkedList.add(new byte[]{(byte) bArr.length});
        linkedList.add(bArr);
        linkedList.add(catg.m127162a(new byte[]{this.f175493l.f175623d}));
        linkedList.add(catg.m127162a(this.f175491j.f175555g));
        linkedList.add(m126886c());
        linkedList.add(bArr4);
        linkedList.add(catg.m127162a(this.f175490i.f175473i));
        byte[] a = catg.m127161a(linkedList);
        catg.m127165b(linkedList);
        catg.m127166c(bArr);
        catg.m127166c(this.f175494m);
        byte[] b = m126885b(a);
        LinkedList linkedList2 = new LinkedList();
        int length = (this.f175495n - b.length) - 2;
        byte[] bArr5 = new byte[length];
        System.arraycopy(a, 0, bArr5, 0, length);
        linkedList2.add(new byte[]{106});
        linkedList2.add(bArr5);
        linkedList2.add(b);
        linkedList2.add(new byte[]{-68});
        byte[] a2 = catg.m127161a(linkedList2);
        try {
            byte[] a3 = this.f175489h.mo74733a(a2);
            catg.m127166c(a);
            catg.m127166c(b);
            catg.m127166c(a2);
            catg.m127165b(linkedList2);
            return a3;
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new capk(valueOf.length() == 0 ? new String("Crypto Error: ") : "Crypto Error: ".concat(valueOf));
        } catch (Throwable th) {
            catg.m127166c(a);
            catg.m127166c(b);
            catg.m127166c(a2);
            catg.m127165b(linkedList2);
            throw th;
        }
    }

    public caop(caox caox, caoo caoo, caqk caqk, capy capy, caqv caqv, byte[] bArr, cary cary) {
        this.f175489h = caox;
        this.f175490i = caoo;
        this.f175491j = caqk;
        this.f175492k = capy;
        this.f175493l = caqv;
        this.f175494m = bArr;
        this.f175496o = cary;
        this.f175495n = m126883a();
        LinkedList linkedList = new LinkedList();
        linkedList.add(cath.m127170a(f175484c, new byte[]{this.f175493l.f175623d}));
        linkedList.add(cath.m127170a(f175485d, this.f175493l.f175620a));
        linkedList.add(cath.m127170a(f175488g, m126884b()));
        linkedList.add(cath.m127170a(f175487f, this.f175493l.f175621b));
        capy capy2 = this.f175492k;
        if (capy2 != null) {
            linkedList.add(capy2.mo74753e());
        }
        byte[] a = cath.m127170a(f175483b, catg.m127161a(linkedList));
        catg.m127165b(linkedList);
        mo74724a(a);
        catg.m127166c(a);
    }

    /* renamed from: b */
    private static final byte[] m126885b(byte[] bArr) {
        try {
            return catg.m127169e(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new capk(e.getMessage());
        }
    }
}
