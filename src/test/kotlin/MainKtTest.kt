import org.junit.Test

import org.junit.Assert.*
import ru.netology.*
import org.junit.Assert.assertEquals as assertEquals

class MainKtTest {

    @Test
    fun shoult_calculate_All_MC_else() {
        //arrange
        val amountPrise = 8000000
        val card = MC
        val expectedComm = 50000
        //act
        val Actualcomm = calculateAll(amountPrise,card)
        assertEquals(expectedComm,Actualcomm)
    }


    @Test
    fun shoult_calculate_All_VKPAY_else() {
        //arrange
        val amountPrise = 100015
        val card = VKPAY
        val expectedComm = 0
        //act
        val Actualcomm = calculateAll(amountPrise,card)
        assertEquals(expectedComm,Actualcomm)
    }


    @Test
    fun shoult_calculate_All_Maestro_else() {
        //arrange
        val amountPrise = 4000000
        val card = MAESTRO
        val expectedComm = 0
        //act
        val Actualcomm = calculateAll(amountPrise,card)
        assertEquals(expectedComm,Actualcomm)
    }


    @Test
    fun shoult_calculate_All_VISA_else() {
        //arrange
        val amountPrise = 10000
        val card = VISA
        val expectedComm = 3500
        //act
        val Actualcomm = calculateAll(amountPrise,card)
        assertEquals(expectedComm,Actualcomm)
    }


    @Test
    fun shoult_calculate_All_MIR_else() {
        //arrange
        val amountPrise = 8000015
        val card = MIR
        val expectedComm =60000
        //act
        val Actualcomm = calculateAll(amountPrise,card)
        assertEquals(expectedComm,Actualcomm)
    }
}