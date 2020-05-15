package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: xfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xfc extends xfd {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        xkj xkj = (xkj) obj;
        switch (xkj.ordinal()) {
            case 0:
                throw new IllegalArgumentException("Not an error.");
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 27:
            case 28:
            case 29:
            case 31:
            case 32:
            case 34:
            case 35:
            case 36:
            case FelicaException.TYPE_NOT_CLOSED:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
            case FelicaException.TYPE_USED_BY_OTHER_APP:
            case FelicaException.TYPE_PUSH_FAILED:
            case 41:
            case FelicaException.TYPE_ALREADY_ACTIVATED:
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
            case FelicaException.TYPE_RESET_FAILED:
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
            case 47:
            case 48:
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
            case 50:
                return 34007;
            case 18:
            case 33:
                return 34001;
            case 21:
                throw new IllegalArgumentException("This exception should be ignored.");
            case 25:
            case 30:
                return 34000;
            case 26:
                return 34010;
            default:
                String valueOf = String.valueOf(xkj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Unrecognized status code: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
