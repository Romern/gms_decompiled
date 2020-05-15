package p000;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: beaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beaq implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: A */
    private boolean f106779A;

    /* renamed from: B */
    private boolean f106780B;

    /* renamed from: C */
    private boolean f106781C;

    /* renamed from: D */
    private boolean f106782D;

    /* renamed from: E */
    private boolean f106783E;

    /* renamed from: F */
    private boolean f106784F;

    /* renamed from: G */
    private boolean f106785G;

    /* renamed from: H */
    private beas f106786H = null;

    /* renamed from: I */
    private boolean f106787I;

    /* renamed from: J */
    private boolean f106788J;

    /* renamed from: K */
    private beas f106789K = null;

    /* renamed from: L */
    private boolean f106790L;

    /* renamed from: M */
    private beas f106791M = null;

    /* renamed from: N */
    private boolean f106792N;

    /* renamed from: O */
    private beas f106793O = null;

    /* renamed from: P */
    private boolean f106794P;

    /* renamed from: Q */
    private beas f106795Q = null;

    /* renamed from: R */
    private boolean f106796R;

    /* renamed from: S */
    private beas f106797S = null;

    /* renamed from: T */
    private String f106798T = "";

    /* renamed from: U */
    private boolean f106799U;

    /* renamed from: V */
    private String f106800V = "";

    /* renamed from: W */
    private boolean f106801W;

    /* renamed from: X */
    private String f106802X = "";

    /* renamed from: Y */
    private boolean f106803Y;

    /* renamed from: Z */
    private boolean f106804Z;

    /* renamed from: a */
    public beas f106805a = null;

    /* renamed from: aa */
    private boolean f106806aa = false;

    /* renamed from: ab */
    private boolean f106807ab = false;

    /* renamed from: ac */
    private boolean f106808ac = false;

    /* renamed from: b */
    public beas f106809b = null;

    /* renamed from: c */
    public beas f106810c = null;

    /* renamed from: d */
    public beas f106811d = null;

    /* renamed from: e */
    public beas f106812e = null;

    /* renamed from: f */
    public beas f106813f = null;

    /* renamed from: g */
    public beas f106814g = null;

    /* renamed from: h */
    public beas f106815h = null;

    /* renamed from: i */
    public beas f106816i = null;

    /* renamed from: j */
    public beas f106817j = null;

    /* renamed from: k */
    public beas f106818k = null;

    /* renamed from: l */
    public int f106819l = 0;

    /* renamed from: m */
    public String f106820m = "";

    /* renamed from: n */
    public boolean f106821n;

    /* renamed from: o */
    public String f106822o = "";

    /* renamed from: p */
    public String f106823p = "";

    /* renamed from: q */
    public String f106824q = "";

    /* renamed from: r */
    public boolean f106825r = false;

    /* renamed from: s */
    public final List f106826s = new ArrayList();

    /* renamed from: t */
    public final List f106827t = new ArrayList();

    /* renamed from: u */
    public boolean f106828u;

    /* renamed from: v */
    public String f106829v = "";

    /* renamed from: w */
    private boolean f106830w;

    /* renamed from: x */
    private boolean f106831x;

    /* renamed from: y */
    private boolean f106832y;

    /* renamed from: z */
    private boolean f106833z;

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            beas beas = new beas();
            beas.readExternal(objectInput);
            this.f106830w = true;
            this.f106805a = beas;
        }
        if (objectInput.readBoolean()) {
            beas beas2 = new beas();
            beas2.readExternal(objectInput);
            this.f106831x = true;
            this.f106809b = beas2;
        }
        if (objectInput.readBoolean()) {
            beas beas3 = new beas();
            beas3.readExternal(objectInput);
            this.f106832y = true;
            this.f106810c = beas3;
        }
        if (objectInput.readBoolean()) {
            beas beas4 = new beas();
            beas4.readExternal(objectInput);
            this.f106833z = true;
            this.f106811d = beas4;
        }
        if (objectInput.readBoolean()) {
            beas beas5 = new beas();
            beas5.readExternal(objectInput);
            this.f106779A = true;
            this.f106812e = beas5;
        }
        if (objectInput.readBoolean()) {
            beas beas6 = new beas();
            beas6.readExternal(objectInput);
            this.f106780B = true;
            this.f106813f = beas6;
        }
        if (objectInput.readBoolean()) {
            beas beas7 = new beas();
            beas7.readExternal(objectInput);
            this.f106781C = true;
            this.f106814g = beas7;
        }
        if (objectInput.readBoolean()) {
            beas beas8 = new beas();
            beas8.readExternal(objectInput);
            this.f106782D = true;
            this.f106815h = beas8;
        }
        if (objectInput.readBoolean()) {
            beas beas9 = new beas();
            beas9.readExternal(objectInput);
            this.f106783E = true;
            this.f106816i = beas9;
        }
        if (objectInput.readBoolean()) {
            beas beas10 = new beas();
            beas10.readExternal(objectInput);
            this.f106784F = true;
            this.f106817j = beas10;
        }
        if (objectInput.readBoolean()) {
            beas beas11 = new beas();
            beas11.readExternal(objectInput);
            this.f106785G = true;
            this.f106786H = beas11;
        }
        if (objectInput.readBoolean()) {
            beas beas12 = new beas();
            beas12.readExternal(objectInput);
            this.f106787I = true;
            this.f106818k = beas12;
        }
        if (objectInput.readBoolean()) {
            beas beas13 = new beas();
            beas13.readExternal(objectInput);
            this.f106788J = true;
            this.f106789K = beas13;
        }
        if (objectInput.readBoolean()) {
            beas beas14 = new beas();
            beas14.readExternal(objectInput);
            this.f106790L = true;
            this.f106791M = beas14;
        }
        if (objectInput.readBoolean()) {
            beas beas15 = new beas();
            beas15.readExternal(objectInput);
            this.f106792N = true;
            this.f106793O = beas15;
        }
        if (objectInput.readBoolean()) {
            beas beas16 = new beas();
            beas16.readExternal(objectInput);
            this.f106794P = true;
            this.f106795Q = beas16;
        }
        if (objectInput.readBoolean()) {
            beas beas17 = new beas();
            beas17.readExternal(objectInput);
            this.f106796R = true;
            this.f106797S = beas17;
        }
        this.f106798T = objectInput.readUTF();
        this.f106819l = objectInput.readInt();
        this.f106820m = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f106799U = true;
            this.f106800V = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f106801W = true;
            this.f106802X = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.f106821n = true;
            this.f106822o = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.f106803Y = true;
            this.f106823p = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.f106804Z = true;
            this.f106824q = readUTF5;
        }
        this.f106825r = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            beap beap = new beap();
            beap.readExternal(objectInput);
            this.f106826s.add(beap);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            beap beap2 = new beap();
            beap2.readExternal(objectInput);
            this.f106827t.add(beap2);
        }
        this.f106806aa = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.f106828u = true;
            this.f106829v = readUTF6;
        }
        this.f106807ab = objectInput.readBoolean();
        this.f106808ac = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f106830w);
        if (this.f106830w) {
            this.f106805a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106831x);
        if (this.f106831x) {
            this.f106809b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106832y);
        if (this.f106832y) {
            this.f106810c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106833z);
        if (this.f106833z) {
            this.f106811d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106779A);
        if (this.f106779A) {
            this.f106812e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106780B);
        if (this.f106780B) {
            this.f106813f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106781C);
        if (this.f106781C) {
            this.f106814g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106782D);
        if (this.f106782D) {
            this.f106815h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106783E);
        if (this.f106783E) {
            this.f106816i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106784F);
        if (this.f106784F) {
            this.f106817j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106785G);
        if (this.f106785G) {
            this.f106786H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106787I);
        if (this.f106787I) {
            this.f106818k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106788J);
        if (this.f106788J) {
            this.f106789K.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106790L);
        if (this.f106790L) {
            this.f106791M.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106792N);
        if (this.f106792N) {
            this.f106793O.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106794P);
        if (this.f106794P) {
            this.f106795Q.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106796R);
        if (this.f106796R) {
            this.f106797S.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.f106798T);
        objectOutput.writeInt(this.f106819l);
        objectOutput.writeUTF(this.f106820m);
        objectOutput.writeBoolean(this.f106799U);
        if (this.f106799U) {
            objectOutput.writeUTF(this.f106800V);
        }
        objectOutput.writeBoolean(this.f106801W);
        if (this.f106801W) {
            objectOutput.writeUTF(this.f106802X);
        }
        objectOutput.writeBoolean(this.f106821n);
        if (this.f106821n) {
            objectOutput.writeUTF(this.f106822o);
        }
        objectOutput.writeBoolean(this.f106803Y);
        if (this.f106803Y) {
            objectOutput.writeUTF(this.f106823p);
        }
        objectOutput.writeBoolean(this.f106804Z);
        if (this.f106804Z) {
            objectOutput.writeUTF(this.f106824q);
        }
        objectOutput.writeBoolean(this.f106825r);
        int size = this.f106826s.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((beap) this.f106826s.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.f106827t.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((beap) this.f106827t.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f106806aa);
        objectOutput.writeBoolean(this.f106828u);
        if (this.f106828u) {
            objectOutput.writeUTF(this.f106829v);
        }
        objectOutput.writeBoolean(this.f106807ab);
        objectOutput.writeBoolean(this.f106808ac);
    }
}
